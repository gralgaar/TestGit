package home_work.lesson019.task1;

public class Car {
    private String model;
    private String color;
    private String number;

    Car(String model, String color, String number) {
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

    public String getNumber() {
        return number;
    }
}
