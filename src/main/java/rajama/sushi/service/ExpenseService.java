package rajama.sushi.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import rajama.sushi.models.Expense;

@Service
public class ExpenseService {
    List<Expense> expenseList = new ArrayList<Expense>();

    public ExpenseService() {
        expenseList.add(new Expense(1, 10, "nina", new Date()));
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public Expense postExpense(Expense expense) {
        expenseList.add(expense);
        return expense;
    }

}
