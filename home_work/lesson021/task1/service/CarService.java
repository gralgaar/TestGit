package home_work.lesson021.task1.service;

import home_work.lesson021.task1.model.Car;
import home_work.lesson021.task1.model.CarIdentifier;

public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars) {
        this.cars = cars;
    }

    //    Упростим реализацию метода в сравнении с вариантом в уроке 19 для большей наглядности
    public Car findCar(CarIdentifier identifier) {
        for (Car c : cars) {
//            Нет особого смысла реализовывать и использовать equals() для Car, по крайне мере,
//            для операции поиска
            if (c.getIdentifier().equals(identifier)) {
                return c;
            }
        }

//        По желанию можно выбросить исключение
        return null;
    }
}