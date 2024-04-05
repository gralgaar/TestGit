package home_work.lesson020.task2;

public class InputValidationSizeException extends Exception {
    private int num;

    public InputValidationSizeException(String message, int num) {
        super(message);
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
