package behavioral.state;

public class ShoppingOrder{
    private ShoppingOrderState state = new OrderPending(this);

    public ShoppingOrderState getState() {
        return state;
    }

    public void setState(ShoppingOrderState state) {
        this.state = state;
        System.out.println("Estado do pedido alterado para: " + state.getName());
    }

    public String getStateName() {
        return state.getName();
    }

    public void approvePayment() {
        state.approvePayment();
    }

    public void rejectPayment() {
        state.rejectPayment();
    }

    public void waitPayment() {
        state.waitPayment();
    }

    public void shipOrder() {
        state.shipOrder();
    }
}
