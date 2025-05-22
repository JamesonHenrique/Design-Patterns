package behavioral.memento;

public class MementoMain {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History(editor);
        history.backup();
        editor.setTitle("text");
        history.backup();
        editor.setContent("Olá, meu nome é James");
        history.backup();
        editor.setTitle("A vida de um programador: meus mementos");
        System.out.println("Title: " + editor.getTitle());
        System.out.println("Content: " + editor.getContent());
        history.undo();
        System.out.println("Title: " + editor.getTitle());
        System.out.println("Content: " + editor.getContent());
        history.showHistory();
        history.undo();
        System.out.println("Title: " + editor.getTitle());
        System.out.println("Content: " + editor.getContent());
        history.undo();
        System.out.println("Title: " + editor.getTitle());
        System.out.println("Content: " + editor.getContent());
    }
}
