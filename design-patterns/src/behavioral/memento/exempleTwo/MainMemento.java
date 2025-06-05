package behavioral.memento.exempleTwo;

import java.time.LocalDateTime;

public class MainMemento {
    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor("/media/images/image.png",
                ".png");

        ImageEditorBackupManager imageEditorBackupManager = new ImageEditorBackupManager(imageEditor);
        imageEditorBackupManager.backup();

        imageEditor.convertFormatTo("gif");
        imageEditorBackupManager.backup();
        imageEditor.convertFormatTo("jpg");
        imageEditorBackupManager.backup();
        imageEditor.convertFormatTo("png");
        imageEditorBackupManager.backup();

        imageEditorBackupManager.undo();
        imageEditorBackupManager.undo();
        imageEditorBackupManager.showMementos();

        System.out.println(imageEditor);

    }
}
