package exeptions;

public class NumberEmptyException extends NumberFormatException {
    public NumberEmptyException(String message) {
        super(message);
    }
}
