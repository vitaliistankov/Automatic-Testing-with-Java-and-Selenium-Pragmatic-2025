package bg.pragmatic;

public interface Notepad {
    void createPage(String title, String text);
    void replaceText(int pageNumber, String newText) throws PageNotFoundException;
    void deleteText(int pageNumber) throws PageNotFoundException;
    void previewAllPages();
}
