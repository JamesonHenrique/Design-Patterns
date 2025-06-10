package behavioral.chainOfResponsibility;

public class SellerBudgetHandler extends BaseBudgetHandler {

    public CustomerBudget handle(CustomerBudget budget) {
        if (budget.getTotal() <= 1000) {
            System.out.println("Orçamento aprovado pelo vendedor: " + budget.getTotal());
            budget.setApproved(true);
            return budget;
        }
        return super.handle(budget);
    }
}
