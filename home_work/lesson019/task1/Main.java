package home_work.lesson019.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("tesla", "grey", "t"),
                new Car("Bugatti", "Red", "ad 1986 yu"),
                new Car("Ferrary", "Red", "ds 0001 hg"),
                new Car("UAZ patrior", "Greeen", "iu 8943 ru")
        };
        System.out.println(cars[0].toString());
        System.out.println(cars[1].toString());
        System.out.println(cars[2].toString());
        System.out.println(cars[3].toString());


        Scanner sc = new Scanner(System.in);
        String carNumber;
        boolean findCar = false; //флаг обозначабщий, что пользователь дал команду искать мащину
        System.out.println("Найти машину по номеру 1-да: ");
        if (sc.nextInt() == 1) {
            sc.nextLine();
            System.out.println("Введите номер машины: ");
            carNumber = sc.nextLine();
            System.out.println("carNumber " + carNumber);

            Car car = findCar(carNumber, cars);

            System.out.println(car.toString());
        }

        sc.close();

    }

    public static Car findCar(String number, Car[] cars) {
        for (Car car : cars) {
            if (number.equals(car.getNumber())) {
                return car;
            }
        }
        return null;
    }
}
