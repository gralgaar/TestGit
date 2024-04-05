package home_work.lesson020.task2.model;

import home_work.lesson020.task2.InputValidationSizeException;
import home_work.lesson020.task2.InputValidationShapeException;

public class ShapePrinter {
    public static final int SQUARE = 1;
    public static final int TRIANGLE = 2;


    public static String print(int length, int type) throws InputValidationSizeException, InputValidationShapeException {

        if (length < 1) throw new InputValidationSizeException("Размер фигуры доложен быть больше нуля", length);

        if (type != SQUARE && type != TRIANGLE)
            throw new InputValidationShapeException("Неопределён формат фигуры.", type);

        EquilateralShape shape;

        switch (type) {
            case SQUARE:
                shape = new Square(length);
                break;
            case TRIANGLE:
                shape = new EquilateralTriangle(length);
                break;
            default:
                return "Unknown shape";
        }
        System.out.println("dfgdg");
        return shape.createShapeString();
    }
}
