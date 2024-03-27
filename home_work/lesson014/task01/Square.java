package home_work.lesson014.task01;

public class Square extends Shape {

    public Square(int size) {
        super(size);
        System.out.println("КВАДРАТ");
    }

    public void print() {
        int size = this.size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 || i == size - 1) && !(j == 0 || j == size - 1)) System.out.print("-");
                else if ((j == 0 || j == size - 1) && !(i == 0 || i == size - 1)) System.out.print("|");
                else System.out.print(" ");

            }
            System.out.println();
        }
    }
}
