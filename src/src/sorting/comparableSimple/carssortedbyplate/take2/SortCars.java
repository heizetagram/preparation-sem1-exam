package sorting.comparableSimple.carssortedbyplate.take2;

import java.util.ArrayList;
import java.util.Collections;

public class SortCars {
    public static void main(String[] args) {
        new SortCars().run();
    }

    private void run() {
        ArrayList<Car> cars = new ArrayList<>();

        Car c1 = new Car("FB49027", 2012);
        Car c2 = new Car("AT18856", 2009);
        Car c3 = new Car("AT18858", 2015);
        Car c4 = new Car("AT18857", 2019);
        Car c5 = new Car("CH10923", 2005);
        Car c6 = new Car("ZX01294", 1999);

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);

        // Before sorting
        System.out.println("Before sorting:");
        printAllCars(cars);

        // Sort by plate
        System.out.println("By plate:");
        Car.setSortCriteria(SortCriteria.PLATE);
        Collections.sort(cars);
        printAllCars(cars);

        // Sort by model year
        System.out.println("By model year");
        Car.setSortCriteria(SortCriteria.MODEL_YEAR);
        Collections.sort(cars);
        printAllCars(cars);
    }

    private void printAllCars(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getPlate() + ", " + car.getModelYear());
        }
        System.out.println();
    }
}
