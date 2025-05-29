package creational.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        Address address = new Address(
                "Rua do Rio",
                "Rio de Janeiro",
                "Rio de Janeiro",
                "00000-000");
        Person prototype = new Person("Original", 100.0);
        prototype.addAddress(address);
        Person clonedPrototype = prototype.clone();

        System.out.println("Original Prototype: " + prototype);
        System.out.println("Cloned Prototype: " + clonedPrototype);
        System.out.println("São objetos diferentes? " + (prototype != clonedPrototype));

        System.out.println("---------------------------------------------------");
        clonedPrototype.setName("Cloned");
        System.out.println("Após alterar o nome do clone:" + clonedPrototype);
        System.out.println("---------------------------------------------------");

        clonedPrototype.getAddress().getFirst().setStreet("Rua do Sol");
        System.out.println("Endereço do original após alteração no clone: " + prototype.getAddress());
        System.out.println("Endereço do clone após alteração: " + clonedPrototype.getAddress());
    }
}
