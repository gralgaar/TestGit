package home_work.lesson012.com.walking.counterAggregation;

public class Counter {


    private int serialNumber;
    private int type;
    private int indication;

    public Counter(int type, int serialNumber) {
        this(type, serialNumber, 0);
    }

    public Counter(int type, int serialNumber, int indication) {
        this.serialNumber = serialNumber;
        this.indication = indication;
        if ((type >= 0) || (type < 4)) this.type = type;
        else System.out.println("\n ERROR");
    }

    public void printCounter() {
        System.out.printf("serial number: %06d       TYPE:%s %5d\n", this.serialNumber, this.getTypeCounter(), this.indication);
    }

    public void increase(int value) {
        this.indication += value;
    }

    public String getTypeCounter() {
        return switch (this.type) {
            case 0 -> "GAS        ";
            case 1 -> "COLD_WATER ";
            case 2 -> "HOT_WATER  ";
            case 3 -> "ELECTRICITY";
            default -> "ERROR      ";
        };
    }
}