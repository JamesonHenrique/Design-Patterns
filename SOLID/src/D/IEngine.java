package D;

/**
 * Interface que representa um motor.
 * Segue o Princípio da Inversão de Dependência (DIP), pois abstrai o comportamento
 * do motor, permitindo que diferentes implementações sejam usadas sem alterar
 * as classes que dependem dela.
 */
public interface IEngine {
    void start();
}
