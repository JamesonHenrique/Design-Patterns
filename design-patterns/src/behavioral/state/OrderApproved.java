package behavioral.state;

public class OrderApproved implements ShoppingOrderState{
    private final ShoppingOrder shoppingOrder;

    public OrderApproved(ShoppingOrder shoppingOrder) {
        this.shoppingOrder = shoppingOrder;
    }

    @Override
    public String getName() {
        return "Order Approved";
    }

    @Override
    public void approvePayment() {
        System.out.println("Pagamento já aprovado.");
    }

    @Override
    public void rejectPayment() {
        shoppingOrder.setState(new OrderReject(shoppingOrder));
    }

    @Override
    public void waitPayment() {
        shoppingOrder.setState(new OrderPending(shoppingOrder));
    }

    @Override
    public void shipOrder() {
        System.out.println("Enviando o pedido...");
    }
}
