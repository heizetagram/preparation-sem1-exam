package sorting.comparableSimple.carssortedbyplate;

public class Car implements Comparable<Car> {
    private String plate;

    public Car(String plate) {
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }

    // Compare 'this' to a specific Car object 'c''s plate
    public int compareTo(Car c) {
        // Descending
        return plate.compareTo(c.plate);

        // Ascending
        //return c.plate.compareTo(plate);
    }
}
