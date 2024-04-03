package home_work.lesson018.task1.model;

public class Cow extends Animal {
    public static final String COW_CLASS_NAME = "Cow";

    public Cow() {
        super(COW_CLASS_NAME, "moo");
    }

    public void moo() {
        sound();
    }
}
