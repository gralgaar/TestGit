package home_work.lesson033.task1;

import home_work.lesson033.task1.model.Car;
import home_work.lesson033.task1.repository.CarRepository;
import home_work.lesson033.task1.service.CarService;

public class Main {
    public static void main(String[] args) {

        CarService service = new CarService();

        service.addCar(new Car("Tesla", "Grey", "t1"));
        service.addCar(new Car("Bugatti", "Red", "ad 1986 yu"));
        service.addCar(new Car("Ferrari", "Red", "ds 0001 hg"));
        service.addCar(new Car("UAZ patriot", "Green", "iu 8943 ru"));


        System.out.println("Объекты в CarService:");

        System.out.println(service);

        CarRepository repository = new CarRepository("./resource/lesson033/task1/carCatalog.txt");
        repository.saveAll(service);

//        System.out.println(cars[0]);
//        System.out.println(cars[1]);
//        System.out.println(cars[2]);
//        System.out.println(cars[3] + "\n");


//
//        CarService service2 = new CarService(repository.getCars());
//
//        System.out.println(service2);


    }
}
