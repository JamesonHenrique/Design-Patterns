package behavioral.state;

public class MainState {
    public static void main(String[] args) {
        ShoppingOrder shoppingOrder = new ShoppingOrder();

        shoppingOrder.waitPayment();
        shoppingOrder.shipOrder();
        shoppingOrder.approvePayment();
        shoppingOrder.shipOrder();

        shoppingOrder.rejectPayment();
        shoppingOrder.rejectPayment();
        shoppingOrder.approvePayment();
        shoppingOrder.waitPayment();

        shoppingOrder.shipOrder();
    }
}
