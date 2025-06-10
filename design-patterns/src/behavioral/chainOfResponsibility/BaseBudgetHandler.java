package behavioral.chainOfResponsibility;

public abstract class BaseBudgetHandler {
    protected BaseBudgetHandler nextHandler = null;

    public BaseBudgetHandler setNextHandler(BaseBudgetHandler handler) {
        this.nextHandler = handler;
        return handler;
    }
    public CustomerBudget handle(CustomerBudget budget) {
        if (nextHandler != null) {
            return nextHandler.handle(budget);
        }
        return budget;
    }
}
