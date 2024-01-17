package eksamensopgaver.chatGPT.cars;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        CarGarage carGarage = new CarGarage();

        carGarage.getCars().add(new Car("Audi", "A3", 2000));
        carGarage.getCars().add(new Car("Audi", "A5", 2013));
        carGarage.getCars().add(new Car("Mercedes", "G-WAGON", 2012));
        carGarage.getCars().add(new Car("Mercedes", "G-WAGON", 2020));

        ArrayList<Car> audiCars = carGarage.findCarsByBrand("Audi");

        for (Car car : audiCars) {
            System.out.println(car.getBrand() + car.getModel() + car.getYear());
        }

        carGarage.getOldestCar();
    }
}
