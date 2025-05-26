public class Page {
    private String title;
    private String text;
    private int pageNumber;

    public Page(String title, String text, int pageNumber) {
        this.title = title;
        this.text = text;
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void addText(String text) {
        this.text = this.text + text;
    }

    public void deleteText() {
        this.text = "";
    }

    public String preview() {
        return this.title + "\n" + this.text;
    }
}
