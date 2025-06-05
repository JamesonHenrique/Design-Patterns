package behavioral.memento.exempleOne;

import java.util.ArrayList;
import java.util.List;
// Caretaker
public class History {
    private final List<EditorState> states = new ArrayList<>();
    private final Editor editor;

    public History(Editor editor) {
        this.editor = editor;
    }
    public void backup() {
        states.add(editor.createState());
    }
    public void undo() {
        if(states.isEmpty()) {
            return;
        }
        EditorState prevState = states.getLast();
        states.remove(prevState);
        editor.restoreState(prevState);
    }
    public void showHistory() {
        System.out.println("Aqui está a lista de mementos:");
        for (EditorState state : states) {
            System.out.println(state.getName());
        }
    }

}
