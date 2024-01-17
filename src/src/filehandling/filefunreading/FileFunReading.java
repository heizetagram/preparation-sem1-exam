package filehandling.filefunreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileFunReading {
    public static void main(String[] args) {
        new FileFunReading().run();
    }

    private void run() {
        try {
            Scanner reader = new Scanner(new File("FileFunReading.txt"));
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
