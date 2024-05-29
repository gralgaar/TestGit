package home_work.lesson033.task1.exception;

public class IllegalAttributeCarException extends RuntimeException {
    public IllegalAttributeCarException() {
        super("Неисвестное поле error");
    }
}
