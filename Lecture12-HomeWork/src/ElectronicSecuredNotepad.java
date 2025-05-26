public class ElectronicSecuredNotepad extends SecuredNotepad implements IЕlectronicDevice {

    private boolean isStarted;

    public ElectronicSecuredNotepad(String password) {
        super(password);
        this.isStarted = false;

    }

    @Override
    public void start() {
        isStarted = true;
        System.out.println("Устройството е стартирано.");

    }

    @Override
    public void stop() {

        isStarted = false;
        System.out.println("Устройството е спряно.");
    }


    @Override
    public boolean isStarted() {
        return isStarted;
    }


    @Override
    public void createPage(String title, String text) {
        super.createPage(title, text);
    }

    @Override
    public void replaceText(int pageNumber, String newText) throws PageNotFoundException {
        super.replaceText(pageNumber, newText);
    }

    @Override
    public void deleteText(int pageNumber) throws PageNotFoundException {
        super.deleteText(pageNumber);
    }

    @Override
    public void previewAllPages() {
        super.previewAllPages();
    }
}
