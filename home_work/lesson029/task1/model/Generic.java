package home_work.lesson029.task1.model;

public class Generic<N> {
    private N object;

    public Generic() {
    }

    public Generic(N object) {
        this.object = object;
    }

    public N getObject() {
        return this.object;
    }
}
