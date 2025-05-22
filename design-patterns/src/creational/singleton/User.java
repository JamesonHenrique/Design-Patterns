package creational.singleton;
/**
 * A classe User representa um usuário com nome e idade.
 *
 * Uso:
 * - Crie instâncias dessa classe para representar usuários no sistema.
 */
public class User {
    private String name;
    private double age;

    public User(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
