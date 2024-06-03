public class ExpenseData {
    private String expenseType;
    private Double delta;

    // Constructor, getters, and setters
    public ExpenseData(String expenseType, Double delta) {
        this.expenseType = expenseType;
        this.delta = delta;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public Double getDelta() {
        return delta;
    }

    public void setDelta(Double delta) {
        this.delta = delta;
    }
}
