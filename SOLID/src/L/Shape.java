package L;

import O.Rectangle;

/**
 * Classe abstrata que representa uma forma geométrica.
 * Segue o Princípio de Substituição de Liskov (LSP), permitindo que subclasses
 * possam ser usadas no lugar da classe base sem alterar o comportamento esperado.
 */
public abstract class Shape {
    public abstract double getArea();
}
