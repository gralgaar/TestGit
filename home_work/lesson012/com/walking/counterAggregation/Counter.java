package home_work.lesson012.com.walking.counterAggregation;

public class Counter {
    public final static int GAS = 0;
    public final static int COLD_WATER = 1;
    public final static int HOT_WATER = 2;
    public final static int ELECTRICITY = 3;

    private static int serialCount = 0;

    private int serialNumber;
    private int type;
    private int counter;

    public Counter(int type) {
        this(type, 0);
    }

    public Counter(int type, int counter) {
        this.serialNumber = serialCount++;
        this.counter = counter;
        this.type = type;
    }

    public int increase(int value) {
        counter += value;
        return counter;
    }

    public void printCounter() {
        System.out.printf("serial number: %06d       TYPE:%s %5d\n", this.serialNumber, this.getTypeCounter(), this.counter);
    }

    public String getTypeCounter() {
        switch (this.type) {
            case 0:
                return "GAS        ";
            case 1:
                return "COLD_WATER ";
            case 2:
                return "HOT_WATER  ";
            case 3:
                return "ELECTRICITY";
            default:
                return "ERROR      ";
        }
    }
}