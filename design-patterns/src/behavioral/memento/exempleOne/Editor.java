package behavioral.memento.exempleOne;

// Originator
public class Editor {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(title, content);
    }

    public void restoreState(EditorState state) {
        this.title = state.getTitle();
        this.content = state.getContent();
    }

}
