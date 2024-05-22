package home_work.lesson030.task2.exception;

public class invalidNameException extends RuntimeException {
    public invalidNameException() {
        super("Невалидное имя");
    }
}
