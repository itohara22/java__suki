package rajama.sushi.exception;

public class ExpenseNotFoundException extends RuntimeException {

    public ExpenseNotFoundException(int id) {
        super("expense with id:" + id + " not found");
    }
}
