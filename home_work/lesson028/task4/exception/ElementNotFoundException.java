package home_work.lesson028.task4.exception;

public class ElementNotFoundException extends RuntimeException {
    public ElementNotFoundException() {
        super("Desired element not found");
    }
}
