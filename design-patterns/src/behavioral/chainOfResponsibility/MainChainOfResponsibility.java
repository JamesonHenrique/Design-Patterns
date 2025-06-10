package behavioral.chainOfResponsibility;

public class MainChainOfResponsibility {
    public static void main(String[] args) {
        CustomerBudget customerBudget = new CustomerBudget(50001);
        SellerBudgetHandler sellerBudgetHandler = new SellerBudgetHandler();

        sellerBudgetHandler
                .setNextHandler(new ManagerBudgetHandler())
                .setNextHandler(new DirectorBudgetHandler())
                .setNextHandler(new CEOBudgetHandler());

        sellerBudgetHandler.handle(customerBudget);

    }
}
