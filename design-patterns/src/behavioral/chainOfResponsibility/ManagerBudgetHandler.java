package behavioral.chainOfResponsibility;

public class ManagerBudgetHandler extends BaseBudgetHandler {

    public CustomerBudget handle(CustomerBudget budget) {
        if (budget.getTotal() <= 5000) {
            System.out.println("Orçamento aprovado pelo gerente: " + budget.getTotal());
            budget.setApproved(true);
            return budget;
        }
        return super.handle(budget);
    }
}
