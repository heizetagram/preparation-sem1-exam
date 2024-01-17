package eksamensopgaver.chatGPT.weather;

import java.time.LocalDate;

public class Main {
    WeatherStation weatherStation;

    public static void main(String[] args) {
        new Main().run();
    }

    private void initVars() {
        weatherStation = new WeatherStation();
    }

    private void run() {
        initVars();
        addWeatherReports();

        System.out.println(weatherStation.getAverageTemperature());
        weatherStation.saveToFile();
        weatherStation.readFromFile();
    }

    private void addWeatherReports() {
        weatherStation.weatherReports().add(new WeatherReport(LocalDate.of(2001, 12, 24), 24, Condition.SUNNY));
        weatherStation.weatherReports().add(new WeatherReport(LocalDate.of(2002, 12, 25), 22, Condition.RAINY));
        weatherStation.weatherReports().add(new WeatherReport(LocalDate.of(2003, 12, 26), 21, Condition.SUNNY));
    }
}
