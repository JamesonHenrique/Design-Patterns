package S;

/**
 * Representa um usuário com nome e e-mail.
 * Esta classe segue o Princípio da Responsabilidade Única (SRP),
 * pois é responsável apenas por armazenar informações do usuário.
 */
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
