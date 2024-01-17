package filehandling;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // File processing template
    // 1. open the file
    // 2. process the file (read/write)
    // 3. close the file

    public static void main(String[] args) {
        new Main().run();

    }

    private void run() {
        //readFile();
        //writeToFilePrintStream();
        //writeToFileFileWriter();
        writeToFileFileOutputStream();

    }

    // File input (reading from a file)
    private void readFile() {
        try {
            Scanner inFile = new Scanner(new File("exc1filehandling.txt"));
            while (inFile.hasNextLine()) {
                String line = inFile.nextLine();
                System.out.println(line);
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File has not been found");
        }
    }

    // File output (writing to a file) using PrintStream (high-level)
    private void writeToFilePrintStream() {
        Random random = new Random();
        try {
            // This creates a new file, if it doesn't already exist, and writes to it.
            PrintStream outFile = new PrintStream("exc1filehandlingout.txt");
            outFile.println("Ten random numbers between 1-10:");
            for (int i = 0; i < 10; i++) {
                outFile.print(random.nextInt(10) + 1);
                if (i < 9) {
                    outFile.print(", ");
                }
            }
            // OS allows you only to write to a single application at a time,
            // to prevent changes being overwritten by other applications.
            // Therefore, you have to let the OS know when to write (reserving the file), and when to stop writing.
            outFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file for writing");
        }
    }

    // Using FileWriter
    private void writeToFileFileWriter() {
        try {
            FileWriter fileWriter = new FileWriter("exc1filehandlingoutfilewriter.txt");
            fileWriter.write("Hello, how is it going?");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to open file");
        }
    }

    // Using a FileOutputStream, which deals with raw bytes and binary data (low-level)
    private void writeToFileFileOutputStream() {
        try {
            FileOutputStream fileOutputStreamer = new FileOutputStream("exc1filehandlingfileoutputstreamer.txt");
            fileOutputStreamer.write(651081812);
            fileOutputStreamer.close();
        } catch (IOException e) {
            System.out.println("Unable to open file");
        }
    }
}
