package behavioral.chainOfResponsibility;

public class DirectorBudgetHandler extends BaseBudgetHandler {

    public CustomerBudget handle(CustomerBudget budget) {
        if (budget.getTotal() <= 50000) {
            System.out.println("Orçamento aprovado pelo diretor: " + budget.getTotal());
            budget.setApproved(true);
            return budget;
        }
        return super.handle(budget);
    }
}
