package eksamensopgaver.chatGPT.weather;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class WeatherStation {
    private ArrayList<WeatherReport> weatherReports;

    public WeatherStation() {
        weatherReports = new ArrayList<>();
    }

    public double getAverageTemperature() {
        int total = 0;

        for (WeatherReport weatherReport : weatherReports) {
            total += weatherReport.getTemperature();
        }

        return total / weatherReports.size();
    }

    public void saveToFile() {
        try {
            PrintStream printStream = new PrintStream(new File("weatherReports.csv"));
            for (WeatherReport weatherReport : weatherReports) {
                printStream.println(weatherReport.getDate() + "," + weatherReport.getTemperature() + "," + weatherReport.getCondition());
            }
            printStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }

    public ArrayList<WeatherReport> weatherReports() {
        return weatherReports;
    }

    // Extra
    public void readFromFile() {
        try {
            Scanner reader = new Scanner(new File("weatherReports.csv"));
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
