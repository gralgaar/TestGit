package home_work.lesson028.task1;

public class Main {
    public static void main(String[] args) {
        Power<Byte> byte6 = new Power<>((byte) 6);

        Power<Integer> int6 = new Power<>(6);


        Power<Double> doubl6 = new Power<>(6d);

        System.out.println(byte6.getPower(6.3));

        System.out.println(int6.getPower(6.3));

        System.out.println(doubl6.getPower(6.3));
    }
}


