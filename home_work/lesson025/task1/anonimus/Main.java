package home_work.lesson025.task1.anonimus;

import java.util.Scanner;

/**
 * Реализуйте класс «Правильная фигура».
 * Для него создайте классы-наследники «Треугольник» и «Квадрат».
 * <p>
 * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
 * Программа должна нарисовать в консоли выбранную пользователем фигуру,
 * используя символы '-', '|', '/', '\'.
 * <p>
 * Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.
 */
public class Main {
    public static final int TRIANGLE = 2;
    public static final int SQUARE = 1;

    public static final String TRIANGLE_HORIZONTAL_SIDE_ELEMENT = "--";
    public static final String TRIANGLE_LEFT_SIDE_ELEMENT = "/";
    public static final String TRIANGLE_RIGHT_SIDE_ELEMENT = "\\";
    public static final String RECTANGLE_HORIZONTAL_ELEMENT = "-";
    public static final String RECTANGLE_VERTICAL_ELEMENT = "|";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape's length: ");
        int length = scanner.nextInt();

        System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
        int shapeType = scanner.nextInt();

        scanner.close();

//        Корректнее валидировать значение сразу после ввода. Здесь проверка вынесена после
//        ради демонстрации ситуации, когда скобки в условном выражении действительно необходимы
        if (length < 1 || (shapeType != SQUARE && shapeType != TRIANGLE)) {
            System.out.println("Incorrect input.");
            return;
        }

        String shapeString = createShapeString(length, shapeType);
        System.out.println(shapeString);
    }


    private static String createShapeString(int length, int type) {
        EquilateralShape shape;

        switch (type) {
            case SQUARE:
                shape = createSquare(length);

                break;
            case TRIANGLE:
                shape = createTriangle(length);
                break;
            default:
                return "Unknown shape";
        }

        return shape.createShapeString();
    }

    private static EquilateralShape createSquare(int length) {
        return new EquilateralShape() {
//            public int getLength(){
//                return length;
//            }


            @Override
            public String createShapeString() {
                String horizontalLine = createHorizontalLine(length);
                String verticalLines = createVerticalLines(length);
                return horizontalLine + verticalLines + horizontalLine;
            }

            private String createHorizontalLine(int length) {
                String horizontalLine = EMPTY_ELEMENT;

                for (int i = 0; i < length; i++) {
                    horizontalLine += RECTANGLE_HORIZONTAL_ELEMENT;
                }

                horizontalLine += EMPTY_ELEMENT + NEW_LINE_SYMBOL;

                return horizontalLine;
            }

            private String createVerticalLines(int length) {
                String verticalLinesUnit = getVerticalLinesUnit(length);

                String verticalLines = EMPTY_STRING;

                for (int i = 0; i < length; i++) {
                    verticalLines += verticalLinesUnit;
                }

                return verticalLines;
            }

            private String getVerticalLinesUnit(int length) {
                String verticalLinesUnit = RECTANGLE_VERTICAL_ELEMENT;

                for (int i = 0; i < length; i++) {
                    verticalLinesUnit += EMPTY_ELEMENT;
                }

                verticalLinesUnit += RECTANGLE_VERTICAL_ELEMENT + NEW_LINE_SYMBOL;

                return verticalLinesUnit;
            }

        };

    }

    private static EquilateralShape createTriangle(int length) {
        return new EquilateralShape() {
            @Override
            public String createShapeString() {
                String triangle = EMPTY_STRING;

                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length - i; j++) {
                        triangle += EMPTY_ELEMENT;
                    }

                    triangle += TRIANGLE_LEFT_SIDE_ELEMENT;

                    for (int j = 0; j < i * 2; j++) {
                        triangle += EMPTY_ELEMENT;
                    }

                    triangle += TRIANGLE_RIGHT_SIDE_ELEMENT + NEW_LINE_SYMBOL;
                }

                triangle += " ";

                for (int i = 0; i < length; i++) {
                    triangle += TRIANGLE_HORIZONTAL_SIDE_ELEMENT;
                }

                return triangle;
            }
        };
    }
}

