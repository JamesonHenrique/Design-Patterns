package behavioral.memento.exempleTwo;

import java.time.LocalDateTime;

public class ConcreteMemento implements Memento{
    private final String name;
    private final LocalDateTime dateTime;
    private final String filePath;
    private final String fileFormat;

    public ConcreteMemento(String name, LocalDateTime dateTime, String filePath, String fileFormat) {
        this.name = name;
        this.dateTime = dateTime;
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFileFormat() {
        return fileFormat;
    }
}
