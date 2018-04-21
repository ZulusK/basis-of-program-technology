package zulus.lab3;

public class MathLangParsingException extends Exception {
    public MathLangParsingException(Exception cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return String.format("ERROR. %s", super.getCause().getMessage());
    }
}
