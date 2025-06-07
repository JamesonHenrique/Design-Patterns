package behavioral.state;

public class OrderReject implements ShoppingOrderState {

    public OrderReject(ShoppingOrder shoppingOrder) {
    }

    @Override
    public String getName() {
        return "Order Reject";
    }

    @Override
    public void approvePayment() {
        System.out.println("O pedido já está rejeitado. Não é possível aprovar o pagamento.");
    }

    @Override
    public void rejectPayment() {
        System.out.println("O pedido já está rejeitado.");
    }

    @Override
    public void waitPayment() {
        System.out.println("O pedido já está rejeitado. Não é possível aguardar o pagamento.");
    }

    @Override
    public void shipOrder() {
        System.out.println("O pedido já está rejeitado. Não é possível enviar o pedido.");
    }
}
