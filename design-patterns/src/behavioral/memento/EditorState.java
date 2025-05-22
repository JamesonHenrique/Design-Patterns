package behavioral.memento;

import java.time.LocalDateTime;

// Memento
public class EditorState {
    private final String title;
    private final String content;
    // State meta data
    private final LocalDateTime stateCreatedAt;
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public EditorState(String title, String content) {
        this.title = title;
        this.content = content;
        this.stateCreatedAt = LocalDateTime.now();
    }

    public LocalDateTime getStateCreatedAt() {
        return stateCreatedAt;
    }
    public String getName() {
        return title + " - " + stateCreatedAt;
    }
}
