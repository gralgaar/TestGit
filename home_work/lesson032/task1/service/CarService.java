package home_work.lesson032.task1.service;

import home_work.lesson032.task1.model.Car;

import java.util.Arrays;

public class CarService {
    private Car[] cars;

    public CarService() {
    }

    public CarService(Car[] cars) {
        addCar(cars);
    }

    public void addCar(Car car) {
        if (this.cars == null) {
            cars = new Car[]{car};
            return;
        }
        Car exictedCar = find(car);

        if (exictedCar != null) {
            System.out.println("Машина в сервисе уже существует");
            return;
        }

        cars = Arrays.copyOf(cars, cars.length + 1);
        cars[cars.length - 1] = car;
    }


    public void addCar(Car[] cars) {
        for (Car car : cars) {
            this.addCar(car);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Car car : this.cars) {
            str.append(car.toString()).append("\n");
        }
        return str.toString();
    }

    private Car find(Car car) {
        //System.out.println("find car: " + car);

        for (Car c : this.cars) {
            if (c.hashCode() == car.hashCode() && c.equals(car)) {
                return c;
            }
        }
        return null;
    }

    public Car[] getAllCars() {
        return this.cars;
    }
}
