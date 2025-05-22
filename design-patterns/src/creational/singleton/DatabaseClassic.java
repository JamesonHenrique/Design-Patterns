package creational.singleton;

import java.util.ArrayList;
import java.util.List;
/**
 * A classe DatabaseClassic implementa o padrão de projeto Singleton.
 * Esse padrão garante que apenas uma instância da classe será criada durante a execução do programa.
 *
 * Vantagens:
 * - Controle centralizado de acesso ao recurso compartilhado (neste caso, uma lista de usuários).
 * - Economia de memória, pois apenas uma instância é criada.
 *
 * Uso:
 * - Utilize o método estático getInstance() para obter a única instância da classe.
 */
public class DatabaseClassic {
    private static DatabaseClassic instance = null;
    private final List<User> users = new ArrayList<>();
    ;

    private DatabaseClassic() {
    }

    public static DatabaseClassic getInstance() {
        if (DatabaseClassic.instance == null) {
            DatabaseClassic.instance = new DatabaseClassic();
        }
        return DatabaseClassic.instance;
    }

    public void add(User user) {
        users.add(user);
    }

    public void remove(int index) {
        users.remove(index);
    }

    public void show() {
        for (User user : users) {
            System.out.println("Nome:" + user.getName() + " - Idade: " + user.getAge());
        }
    }

}
