package behavioral.chainOfResponsibility;

public class CEOBudgetHandler extends BaseBudgetHandler {

    public CustomerBudget handle(CustomerBudget budget) {
        System.out.println("O CEO trata qualquer orçamento: " + budget.getTotal());
        budget.setApproved(true);
        return budget;
    }
}
