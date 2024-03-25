package home_work.lesson013.task01;

public class Cat extends Animal {
    private String color;

    private Cat() {
        System.out.print("I'm a cat ");
    }

    public Cat(String color) {
        this();
        this.color = color;
    }
}
