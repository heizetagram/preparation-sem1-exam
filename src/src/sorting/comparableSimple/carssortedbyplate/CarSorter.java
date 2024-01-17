package sorting.comparableSimple.carssortedbyplate;

import java.util.ArrayList;
import java.util.Collections;

public class CarSorter {
    public static void main(String[] args) {
        new CarSorter().run();
    }

    // Run method
    private void run() {
        ArrayList<Car> cars = new ArrayList<>();

        Car c1 = new Car("FB20123");
        Car c2 = new Car("AF20031");
        Car c3 = new Car("FA88004");

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        System.out.println("Before sorting:");
        printCars(cars);

        System.out.println("\nAfter sorting:");
        // Sort cars ArrayList
        Collections.sort(cars);
        printCars(cars);
    }

    // Print cars
    private void printCars(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getPlate());
        }
    }
}
