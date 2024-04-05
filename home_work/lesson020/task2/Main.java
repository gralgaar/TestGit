package home_work.lesson020.task2;


import home_work.lesson020.task2.model.ShapePrinter;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape's length: ");
        int length = scanner.nextInt();

        System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
        int shapeType = scanner.nextInt();

        scanner.close();

//        Корректнее валидировать значение сразу после ввода. Здесь проверка вынесена после
//        ради демонстрации ситуации, когда скобки в условном выражении действительно необходимы

        ShapePrinter printer = new ShapePrinter();
        try {
            System.out.println(printer.print(length, shapeType));
        } catch (InputValidationSizeException ex1) {
            System.out.println(ex1.getMessage());
            System.out.println(ex1.getNum());
        } catch (InputValidationShapeException ex2) {
            System.out.println(ex2.getMessage());
            System.out.println(ex2.getNum());
        }


    }


}
