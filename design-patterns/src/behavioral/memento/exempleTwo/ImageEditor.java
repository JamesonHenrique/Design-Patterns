package behavioral.memento.exempleTwo;

import java.time.LocalDateTime;
import java.util.List;

public class ImageEditor {
    private String filePath;
    private String fileFormat;
    private final List<String> FORMAT = List.of("jpg", "png", "gif");

    public ImageEditor(String filePath, String fileFormat) {
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    public void convertFormatTo(String newFormat) {
        if (!FORMAT.contains(newFormat)) {
            throw new IllegalArgumentException("Formato não suportado: " + newFormat);
        }
        this.fileFormat = newFormat;
        this.filePath = filePath.replaceFirst("\\.[^.]+$", "." + newFormat);
        System.out.println("Arquivo convertido para: " + fileFormat);
    }

    public Memento save() {
        LocalDateTime dateTime = LocalDateTime.now();
        return new ConcreteMemento(dateTime.toString(), dateTime,
                filePath,
                fileFormat);
    }

    public void restore(Memento memento) {
        if (!(memento instanceof ConcreteMemento concreteMemento)) {
            throw new IllegalArgumentException("Memento inválido");
        }
        this.filePath = concreteMemento.getFilePath();
        this.fileFormat = concreteMemento.getFileFormat();
    }

    @Override
    public String toString() {
        return "ImageEditor{" +
                "filePath='" + filePath + '\'' +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
}
