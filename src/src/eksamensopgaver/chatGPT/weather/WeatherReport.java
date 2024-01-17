package eksamensopgaver.chatGPT.weather;

import java.time.LocalDate;

public class WeatherReport {
    private LocalDate date;
    private int temperature;
    private Condition condition;

    public WeatherReport(LocalDate date, int temperature, Condition condition) {
        this.date = date;
        this.temperature = temperature;
        this.condition = condition;
    }

    public int getTemperature() {
        return temperature;
    }
    public LocalDate getDate() {
        return date;
    }
    public Condition getCondition() {
        return condition;
    }
}
