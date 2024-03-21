package home_work.lesson010.task01;

import java.util.Scanner;

/**
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“,
 * каждая единица ширины – символом “|“.
 * <p>
 * Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
 */
public class Task01 {
    public static String VERTICAL_LINES_UNIT = "||";
    public static String HORIZONTAL_LINES_UNIT = "==";
    public static String SPACE_LINES_UNIT = "  ";


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int length = requireInt(scanner, "Enter rectangle's length: ");
        int width = requireInt(scanner, "Enter rectangle's width: ");

        scanner.close();

        String horizontalLine = createHorizontalLine(length);
        String verticalLines = createVerticalLines(length, width);

        printRectangle(horizontalLine, verticalLines);
    }

    static int requireInt(Scanner scanner, String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        String horizontalLine = SPACE_LINES_UNIT;

        for (int i = 0; i < length; i++) {
            horizontalLine += HORIZONTAL_LINES_UNIT;
        }

        horizontalLine += SPACE_LINES_UNIT + "\n";

        return horizontalLine;
    }

    static String createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        String verticalLines = "";

        for (int i = 0; i < width; i++) {
            verticalLines += verticalLinesUnit;
        }
        return verticalLines;
    }

    static String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = VERTICAL_LINES_UNIT;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += SPACE_LINES_UNIT;
        }

        verticalLinesUnit += VERTICAL_LINES_UNIT + "\n";
        return verticalLinesUnit;
    }
}
