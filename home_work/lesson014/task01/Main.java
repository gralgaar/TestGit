package home_work.lesson014.task01;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int shape;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Выберите форму фигуры:  0-квадрат  1-треугольник");
            shape = sc.nextInt();
        } while (!(shape == 0 || shape == 1));

        System.out.println("Выберите размер фигуры");
        int size = sc.nextInt();
        sc.close();

        ShapeController shControl = new ShapeController(shape, size);
        shControl.print();
    }
}
