package home_work.lesson028.task1;

public class Power<N extends Number> {
    private final N number;

    Power(N number) {
        this.number = number;
    }

    public double getPower(double pow) {
        return Math.pow(number.doubleValue(), pow);

    }
}
