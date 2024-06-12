package home_work.lesson033.task1.repository;

import home_work.lesson033.task1.exception.IllegalAttributeCarException;
import home_work.lesson033.task1.model.Car;
import home_work.lesson033.task1.service.CarService;

import java.io.*;
import java.util.ArrayList;
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

        try (FileWriter fw = new FileWriter(this.dirRepository, true)) {

            fw.write(text);
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

    public void pushCars(CarService service) {

        try (FileReader fileReader = new FileReader(this.dirRepository)) {
            String textCar;
            while (!(textCar = nextLine(fileReader)).equals("empty_string")) {
                //System.out.println(textCar);
                Car car = createCar(textCar);
                service.addCar(car);
            }

            return;

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


    /**
     * Метод создаёт машины. На основании данных в переданной строке
     */
    private Car[] createCars(ArrayList<String> textList) {

        Car[] carsObj = new Car[textList.size()];
        int i = 0;

        for (String carStr : textList) {
            carsObj[i] = createCar(carStr);
            i++;
        }
        return carsObj;
    }

    /**
     * метод извлекает из строчки данные о машнине
     */
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

        Pattern pattern = Pattern.compile("(.*" + fieldCarString + ": \\(|\\).*)");
        Matcher matcher = pattern.matcher(carText);

        return matcher.replaceAll("");
    }

    /**
     * метод извлекает из файла сточку с данными о машине
     */
    private static String nextLine(FileReader fileReader) throws IOException {
        int c;
        StringBuilder str = new StringBuilder();
        //while  ((c = fileReader.read()) != -1){

        while ((c = fileReader.read()) != 10 && c != -1) {
            str.append((char) c);
        }
        //}
        if (str.isEmpty()) {
            return "empty_string";
        }
        return String.valueOf(str);

    }

}
