package eksamensopgaver.chatGPT.cars;

import java.util.ArrayList;
import java.util.Collections;

public class CarGarage {
    private ArrayList<Car> cars;

    public CarGarage() {
        cars = new ArrayList<>();
    }

    /*public void sortCars(Car car) {
        Collections.sort(cars, Comparator.comparing(Car::getYear));
    }

     */

    public void getOldestCar() {
        Collections.sort(cars);
        System.out.println("Oldest car: " + cars.getFirst().getYear());
    }

    public ArrayList<Car> findCarsByBrand(String brand) {
        ArrayList<Car> carsSortedByBrand = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                carsSortedByBrand.add(car);
            }
        }
        return carsSortedByBrand;
    }

    public void printSorted() {
        for (Car car : cars) {
            System.out.println(car.getYear());
        }
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
