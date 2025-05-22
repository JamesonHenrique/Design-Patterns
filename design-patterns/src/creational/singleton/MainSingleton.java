package creational.singleton;

/**
 * Classe principal para demonstrar o uso do padrão Singleton com a classe DatabaseClassic.
 */
public class MainSingleton {
    public static void main(String[] args) {
        DatabaseClassic db1 = DatabaseClassic.getInstance();
        DatabaseClassic db2 = DatabaseClassic.getInstance();
        System.out.println("db1 == db2: " + db1.equals(db2));
        DatabaseClassic databaseClassic = DatabaseClassic.getInstance();
        databaseClassic.add(new User("James", 20));
        databaseClassic.add(new User("Tiago", 15));
        databaseClassic.add(new User("Pedro", 35));
        databaseClassic.show();
        databaseClassic.remove(1);
        System.out.println("Após remover o usuário de id 1");
        databaseClassic.show();
    }
}
