package home_work.lesson028.task2.wrap;

public class Wrapper<E> {
    protected E object;

    public Wrapper() {
    }

    public Wrapper(E object) {
        this.object = object;
    }


    public boolean isNull() {
        return object == null;
    }
}
