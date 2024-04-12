package home_work.lesson026.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = requireInt(scanner, "Enter rectangle's length: ");
        int width = requireInt(scanner, "Enter rectangle's width: ");

        scanner.close();

        String horizontalLine = createHorizontalLine(length).toString();
        String verticalLines = createVerticalLines(length, width).toString();

        printRectangle(horizontalLine, verticalLines);
    }

    static int requireInt(Scanner scanner, String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static StringBuffer createHorizontalLine(int length) {
        StringBuffer horizontalLine = new StringBuffer(" ");

        for (int i = 0; i < length; i++) {
            horizontalLine.append("-");
        }

        horizontalLine.append(" \n");

        return horizontalLine;
    }

    static StringBuffer createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length).toString();

        StringBuffer verticalLines = new StringBuffer();

        for (int i = 0; i < width; i++) {
            verticalLines.append(verticalLinesUnit);
        }
        return verticalLines;
    }

    static StringBuffer getVerticalLinesUnit(int length) {
        StringBuffer verticalLinesUnit = new StringBuffer("|");

        for (int i = 0; i < length; i++) {
            verticalLinesUnit.append(" ");
        }

        verticalLinesUnit.append("|\n");
        return verticalLinesUnit;
    }
}
