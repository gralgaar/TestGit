package home_work.lesson020.task2;

public class InputValidationShapeException extends Exception {
    private int num;

    public InputValidationShapeException(String message, int num) {
        super(message);
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}