package rajama.sushi.exception;

public class CannotSaveExpenseException extends RuntimeException {

    public CannotSaveExpenseException() {
        super("Failed to save expense");
    }

    // whatevere we thorw is Throwable in easy terms
    public CannotSaveExpenseException(Throwable cause) {
        super("Failed to save expense", cause);
    }

}
