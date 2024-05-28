package home_work.lesson032.task1.repository;

import home_work.lesson032.task1.exception.IllegalAttributeCarException;
import home_work.lesson032.task1.model.Car;
import home_work.lesson032.task1.service.CarService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarRepository {
    final int MODEL_CAR = 0;
    final int COLOR_CAR = 1;
    final int NUMBER_CAR = 2;

    final private String dirRepository;

    public CarRepository(String dir) {
        this.dirRepository = dir;
    }

    public void addCar(Car car) {
        String text = formatObjectInText(car); // строка для записи

        try (FileOutputStream fos = new FileOutputStream(this.dirRepository, true)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public void saveAll(CarService service) {
        Car[] cars = service.getAllCars();
        for (Car c : cars) {
            addCar(c);
        }

    }

    public Car[] getCars() {

        String text;

        try {
            text = Files.readString(Path.of(this.dirRepository));
            return createCars(text);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        throw new RuntimeException("В тексте нет машин");
    }

    private String formatObjectInText(Car car) {
        return "model: (" + car.getModel() + ") " +
                "color: (" + car.getColor() + ") " +
                "number: (" + car.getNumber() + ")\n";
    }

    //Метод создаёт машину. На основании данных в переданной строке
    private Car createCar(String carStr) {
        String modelCar = parseTextCar(carStr, MODEL_CAR);
        String colorCar = parseTextCar(carStr, COLOR_CAR);
        String numberCar = parseTextCar(carStr, NUMBER_CAR);
        return new Car(modelCar, colorCar, numberCar);
    }

    //Метод создаёт машины. На основании данных в переданной строке
    private Car[] createCars(String text) {

        //дробим переданный текст на строки. Каждая строка соответствует одной машине
        String[] carsStr = text.split("\n");

        //carsStr.length - колличество машин в переданном тексте
        Car[] carsObj = new Car[carsStr.length];
        int i = 0;

        for (String carStr : carsStr) {
            carsObj[i] = createCar(carStr);
            i++;
        }
        return carsObj;
    }

    //метод извлекае из строчки данные о машнине
    private String parseTextCar(String carText, int fieldCarInt) {

        String fieldCarString = switch (fieldCarInt) {
            case 0:
                yield "model";
            case 1:
                yield "color";
            case 2:
                yield "number";
            default:
                yield "error";

        };

        if (fieldCarString.equals("error")) {
            throw new IllegalAttributeCarException();
        }

//возвращает из строки днныее. Данный соответствуют полю fieldCarString (model/color/number)
        Pattern pattern = Pattern.compile("(.*" + fieldCarString + ": \\(|\\).*)");
        Matcher matcher = pattern.matcher(carText);

        return matcher.replaceAll("");
    }

}
