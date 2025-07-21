package rajama.sushi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rajama.sushi.models.Expense;
import rajama.sushi.service.ExpenseService;

@RestController
public class ExpenseController {

    private ExpenseService es;

    public ExpenseController(ExpenseService expenseService) {
        this.es = expenseService;
    }

    @GetMapping("/expense")
    public List<Expense> getAllExpenses() {
        return es.getExpenseList();
    }

    @PostMapping("/expense")
    public ResponseEntity<Expense> postExpenses(@RequestBody Expense expense) {
        Expense exp = es.postExpense(expense);
        return new ResponseEntity<Expense>(exp, HttpStatus.CREATED);
    }

}
