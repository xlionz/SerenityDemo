package co.com.choucair.serenitydemo.cer.exceptions;

public class ExceptionError extends AssertionError{

    private static final long serialVersionUID = 1L;

    public ExceptionError(String message, Throwable cause) {
        super(message, cause);
    }
}
