package sorting.comparableSimple.carssortedbyplate.take2;

public class Car implements Comparable<Car> {
    private String plate;
    private Integer modelYear;
    private static SortCriteria sortCriteria;

    public Car(String plate, int modelYear) {
        setPlate(plate);
        setModelYear(modelYear);
    }

    // Setters
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public static void setSortCriteria(SortCriteria sortCriteria) {
        Car.sortCriteria = sortCriteria;
    }

    // Getters
    public String getPlate() {
        return plate;
    }
    public int getModelYear() {
        return modelYear;
    }
    public static SortCriteria getSortCriteria() {
        return sortCriteria;
    }

    // CompareTo
    public int compareTo(Car c2) {
        switch (sortCriteria) {
            case PLATE -> {
                return plate.compareTo(c2.plate);
            }
            case MODEL_YEAR -> {
                return c2.modelYear.compareTo(modelYear);
            }
            default -> {
                return 0;
            }
        }
    }
}
