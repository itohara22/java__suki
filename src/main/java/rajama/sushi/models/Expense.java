package rajama.sushi.models;

import java.util.Date;

public class Expense {

    private int expense_id;
    private int amount;
    private String desctiption;
    private Date date;

    public Expense(int expense_id, int amount, String desctiption, Date date) {
        this.expense_id = expense_id;
        this.amount = amount;
        this.desctiption = desctiption;
        this.date = date;
    }

    public int getExpense_id() {
        return expense_id;
    }

    public void setExpense_id(int expense_id) {
        this.expense_id = expense_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
