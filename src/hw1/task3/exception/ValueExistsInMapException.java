package hw1.task3.exception;

public class ValueExistsInMapException extends Exception {
    public ValueExistsInMapException() {
    }

    public ValueExistsInMapException(String message) {
        super(message);
    }
}
