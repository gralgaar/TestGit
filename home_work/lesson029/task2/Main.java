package home_work.lesson029.task2;

public class Main {
    public static void main(String[] args) {
        Power<Byte> byte6 = new Power<>((byte) 6);

        Power<Integer> int6 = new Power<>(6);


        Power<Double> doubl6 = new Power<>(6d);

        Power<?> any6 = createPower(6);

        System.out.println(byte6.getPower(6.3));

        System.out.println(int6.getPower(6.3));

        System.out.println(doubl6.getPower(6.3));

        System.out.println(any6.getPower(6.3));
    }

    private static Power<? extends Number> createPower(Number n) {
        Power<?> power = new Power<>(n);
        return power;
    }
}


