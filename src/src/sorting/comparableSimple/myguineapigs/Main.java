package sorting.comparableSimple.myguineapigs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] hello) {
        new Main().run();
    }

    private void run() {
        ArrayList<GuineaPig> guineaPigs = new ArrayList<>();
        ArrayList<GuineaPig> sortedGuineaPigs = new ArrayList<>();
        /*
        GuineaPig g1 = new GuineaPig("Lars", "Roset", "30");
        GuineaPig g2 = new GuineaPig("Putte", "Glathåret", "50");

        guineaPigs.add(g1);
        guineaPigs.add(g2);
         */

        //writeToFile(guineaPigs);
        loadFromFile(guineaPigs);
        writeToFileSortedByName(guineaPigs);
        writeToFileSortedByRace(guineaPigs);
        writeToFileSortedByGramsOfFood(guineaPigs);

        System.out.println("From guineaPig.txt");
        readGuineaPigFile();

        System.out.println();
        System.out.println("From guineaPigName.txt");
        readGuineaPigNameFile();

        System.out.println();
        System.out.println("From guineaPigRace.txt");
        readGuineaPigRaceFile();

        System.out.println();
        System.out.println("From guineaPigGramsOfFood.txt");
        readGuineaPigGramsOfFoodFile();
    }

    // Writes to file
    private void writeToFile(ArrayList<GuineaPig> guineaPigs) {
        try {
            PrintStream writer = new PrintStream("guineaPig.txt");
            for (GuineaPig guineaPig : guineaPigs) {
                writer.println(guineaPig.getName() + ";" + guineaPig.getRace() + ";" + guineaPig.getGramsOfFood());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }

    // Loads from file and adds to 'guineaPigs' ArrayList
    private void loadFromFile(ArrayList<GuineaPig> guineaPigs) {
        String[] parts;
        try (Scanner reader = new Scanner(new File("guineaPig.txt"))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                parts = line.split(";");
                guineaPigs.add(new GuineaPig(parts[0], parts[1], parts[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    // Write to file sorted by criteria
    private void writeToFileSortedByName(ArrayList<GuineaPig> guineaPigs) {
        sortByName(guineaPigs);
        try {
            PrintStream writer = new PrintStream("guineaPigName.txt");
            writeGuineaPigInfo(guineaPigs, writer);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    private void writeToFileSortedByRace(ArrayList<GuineaPig> guineaPigs) {
        sortByRace(guineaPigs);
        try {
            PrintStream writer = new PrintStream("guineaPigRace.txt");
            writeGuineaPigInfo(guineaPigs, writer);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }
    private void writeToFileSortedByGramsOfFood(ArrayList<GuineaPig> guineaPigs) {
        sortByGramsOfFood(guineaPigs);
        try {
            PrintStream writer = new PrintStream("guineaPigGramsOfFood.txt");
            writeGuineaPigInfo(guineaPigs, writer);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }

    // Sorters
    private void sortByName(ArrayList<GuineaPig> guineaPigs) {
        GuineaPig.setSortCriteria(SortCriteria.NAME);
        Collections.sort(guineaPigs);
    }
    private void sortByRace(ArrayList<GuineaPig> guineaPigs) {
        GuineaPig.setSortCriteria(SortCriteria.RACE);
        Collections.sort(guineaPigs);
    }
    private void sortByGramsOfFood(ArrayList<GuineaPig> guineaPigs) {
        GuineaPig.setSortCriteria(SortCriteria.GRAMS_OF_FOOD);
        Collections.sort(guineaPigs);
    }

    // Write guinea pig info
    private void writeGuineaPigInfo(ArrayList<GuineaPig> guineaPigs, PrintStream writer) {
        for (GuineaPig guineaPig : guineaPigs) {
            writer.println(guineaPig.getName() + ";" + guineaPig.getRace() + ";" + guineaPig.getGramsOfFood());
        }
    }

    // Print out from file
    private void readGuineaPigFile() {
        try {
            Scanner reader = new Scanner(new File("guineaPig.txt"));
            while (reader.hasNextLine()) {
                printGuineaPigInfoFromFile(reader);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    private void readGuineaPigNameFile() {
        try {
            Scanner reader = new Scanner(new File("guineaPigName.txt"));
            while (reader.hasNextLine()) {
                printGuineaPigInfoFromFile(reader);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    private void readGuineaPigRaceFile() {
        try {
            Scanner reader = new Scanner(new File("guineaPigRace.txt"));
            while (reader.hasNextLine()) {
                printGuineaPigInfoFromFile(reader);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    private void readGuineaPigGramsOfFoodFile() {
        try {
            Scanner reader = new Scanner(new File("guineaPigGramsOfFood.txt"));
            while (reader.hasNextLine()) {
                printGuineaPigInfoFromFile(reader);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    // Prints guinea pig info from file
    private void printGuineaPigInfoFromFile(Scanner reader) {
        String line = reader.nextLine();
        String[] parts = line.split(";");
        System.out.println(parts[0] + ", " + parts[1] + ", " + parts[2]);
    }
}
