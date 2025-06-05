package behavioral.memento.exempleTwo;

import java.util.ArrayList;
import java.util.List;

public class ImageEditorBackupManager {
    private final ImageEditor imageEditor;
    private final List<Memento> mementos = new ArrayList<>();

    public ImageEditorBackupManager(ImageEditor imageEditor) {
        this.imageEditor = imageEditor;
    }

    public void backup() {
        System.out.println("Backup realizado");
        mementos.add(imageEditor.save());
    }

    public void undo() {
        if (mementos.isEmpty()) {
            System.out.println("Nenhum backup disponível para desfazer.");
            return;
        }
        Memento memento = mementos.removeLast();
        imageEditor.restore(memento);
        System.out.println("Desfazer realizado");
    }

    void showMementos() {
        System.out.println("Lista de backups:");
        for (int i = 0; i < mementos.size(); i++) {
            System.out.println("Backup " + (i + 1) + ": " + mementos.get(i).getName());
        }
    }
}
