package home_work.lesson033.task1.model;

public class Car {
    private final String model;
    private final String color;
    private final String number;

    public Car(String model, String color, String number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return model + " " + color + " " + "\"" + number + "\"";
    }

    @Override
    public int hashCode() {
        int hash = model.hashCode();
        hash = 31 * hash + color.hashCode();
        hash = 31 * hash + number.hashCode();
        return hash;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

}
