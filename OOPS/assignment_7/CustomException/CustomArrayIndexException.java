package OOPS.assignment_7.CustomException;

public class CustomArrayIndexException extends Exception {
    public CustomArrayIndexException(int index) {
        super("Array Index Out of Bounds of size " + index);
    }
}
