public class DeviceDemo {
    public static void main(String[] args) {
        ElectronicSecuredNotepad acer = new ElectronicSecuredNotepad("123");

        acer.createPage("Title", "Not started yet...");

        acer.start();

        acer.createPage("HW Lecture12", "Read the lecture's materials");

        try {
            acer.replaceText(1, "Read the lecture's materials and review the sample code");
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        acer.previewAllPages();

        acer.stop();

        acer.previewAllPages(); // Won't working.

    }





}
