package home_work.lesson013.task01;

public class Dog extends Animal {
    private String color;

    private Dog() {
        System.out.println("I'm a dog");
    }

    public Dog(String color) {
        this();
        this.color = color;
    }
}
