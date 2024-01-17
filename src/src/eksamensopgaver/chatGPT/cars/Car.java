package eksamensopgaver.chatGPT.cars;

public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private Integer year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public int compareTo(Car c1) {
        return year.compareTo(c1.year);
    }
}
