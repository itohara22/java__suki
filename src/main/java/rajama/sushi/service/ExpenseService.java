package rajama.sushi.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import rajama.sushi.exception.CannotSaveExpenseException;
import rajama.sushi.exception.ExpenseNotFoundException;
import rajama.sushi.models.Expense;
import rajama.sushi.models.User;

@Service
public class ExpenseService {
    List<Expense> expenseList = new ArrayList<Expense>();

    User a = new User(1, "ito", "dante");

    public ExpenseService() {
        expenseList.add(new Expense(1, 10, "nina", new Date(), a));
    }

    public List<Expense> getExpenseList() {
        // to get all fields in json make sure you have getters and setters
        return expenseList;
    }

    public Expense postExpense(Expense expense) {
        try {
            expenseList.add(expense);
            return expense;
        } catch (Exception e) {
            throw new CannotSaveExpenseException(e);
        }
    }

    public Expense getExpense(int expenseId) throws ExpenseNotFoundException {
        for (Expense exp : expenseList) {
            if (exp.getExpense_id() == expenseId) {
                return exp;
            }
        }

        throw new ExpenseNotFoundException(expenseId);
    }

}
