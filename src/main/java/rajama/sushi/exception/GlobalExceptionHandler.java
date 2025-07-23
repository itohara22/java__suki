package rajama.sushi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// use this for controller that handles exceptions
@ControllerAdvice
public class GlobalExceptionHandler {

    // we declare which exception this method will handle
    @ExceptionHandler(exception = ExpenseNotFoundException.class)
    public ResponseEntity<String> handleExpenseNotFound(ExpenseNotFoundException exp) {
        ResponseEntity<String> ree = new ResponseEntity<String>(exp.getMessage(), HttpStatus.NOT_FOUND);
        return ree;
    }

}
