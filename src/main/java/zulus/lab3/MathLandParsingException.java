package zulus.lab3;

public class MathLandParsingException extends Exception {
    public MathLandParsingException(Exception cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return String.format("ERROR. %s", super.getMessage());
    }
}
