package structural.proxy;


public class MainProxy {
    public static void main(String[] args) {
        SystemUserFacade userFacade = new SystemUserFacade("João", "joao_admin");

        userFacade.fetchAndPrintAddresses();
        System.out.println("Todos os endereços foram recebidos e exibidos.");

        System.out.println("Aguardando endereços novamente...");
        userFacade.fetchAndPrintAddresses();
    }
}

