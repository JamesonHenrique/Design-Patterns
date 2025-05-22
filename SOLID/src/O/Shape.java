package O;
/**
 * Classe abstrata que representa uma forma geométrica.
 * Segue o Princípio Aberto/Fechado (OCP), pois está aberta para extensão
 * (novas formas podem ser adicionadas criando subclasses),
 * mas fechada para modificação (não é necessário alterar esta classe para adicionar novas formas).
 */
public abstract class Shape {
     public abstract double calculateArea();
}
