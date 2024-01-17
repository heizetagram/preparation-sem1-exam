package filehandling.FileFunWriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileFunWriting {
    public static void main(String[] args) {
        new FileFunWriting().run();
    }

    private void run() {
        File myFile = new File("FileFunWriting.txt");
        try {
            PrintStream printStream = new PrintStream(myFile);
            printStream.println("Here's one line.");
            printStream.println("And here's another");
            printStream.println();
            printStream.println("And a final line");
            printStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }
}
