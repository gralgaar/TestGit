package home_work.lesson014.task01;

public class Triangle extends Shape {

    public Triangle(int size) {
        super(size);
        System.out.println("ТРЕУГОЛЬНИК");
    }

    public void print() {
        int size = this.size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2 + 1; j++) {
                if (j == size - 1 - i) System.out.print("/");
                else if (j == size + i + 1) System.out.print("\\");
                else if (i == size - 1) System.out.print("_");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
