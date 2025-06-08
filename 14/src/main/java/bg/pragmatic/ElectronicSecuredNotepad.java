package bg.pragmatic;

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

    /**
     * This method creates a new page
     * @param title
     * @param text
     */
    @Override
    public void createPage(String title, String text) {
        if(isStarted)
        super.createPage(title, text);
    }

    /**
     * This method replaces text on a page
     * @param pageNumber
     * @param newText
     * @throws PageNotFoundException
     */

    @Override
    public void replaceText(int pageNumber, String newText) throws PageNotFoundException {
        if(isStarted)
        super.replaceText(pageNumber, newText);
    }

    /**
     * This method delete text on a page
     * @param pageNumber
     * @throws PageNotFoundException
     */

    @Override
    public void deleteText(int pageNumber) throws PageNotFoundException {
        if(isStarted)
        super.deleteText(pageNumber);
    }

    /**
     * This method displays contain of all pages
     */

    @Override
    public void previewAllPages() {
        if(isStarted)
        super.previewAllPages();
    }
}
