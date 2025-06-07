package behavioral.state;

public class OrderPending implements ShoppingOrderState{
    private final ShoppingOrder shoppingOrder;

    public OrderPending(ShoppingOrder shoppingOrder) {
        this.shoppingOrder = shoppingOrder;
    }

    @Override
    public String getName() {
        return "Order Pending";
    }

    @Override
    public void approvePayment() {
        shoppingOrder.setState(new OrderApproved(shoppingOrder));
    }

    @Override
    public void rejectPayment() {
        shoppingOrder.setState(new OrderReject(shoppingOrder));
    }

    @Override
    public void waitPayment() {
        System.out.println("O pedido já está pendente.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Não é possível enviar o pedido, pois ele ainda está pendente.");
    }
}
