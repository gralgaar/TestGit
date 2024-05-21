package home_work.lesson028.task3.exception;

public class ElementNotFoundException extends RuntimeException {
    public ElementNotFoundException() {
        super("Desired element not found");
    }
}
