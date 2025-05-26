public class Demo {
    public static void main(String[] args) {
        Notepad secured = new SecuredNotepad("123");
        secured.createPage("title1", "text1");
        secured.createPage("title2", "text2");
        secured.createPage("title3", "text3");
        secured.createPage("title4", "text4");

        secured.previewAllPages();
        System.out.println("------------");

        try {
            secured.replaceText(3, "nov");
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        secured.previewAllPages();
        System.out.println("---------");

        try {
            secured.deleteText(2);
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        secured.previewAllPages();



//        Notepad simple = new SimpleNotepad();
//        simple.createPage("title1", "text1");
//        simple.createPage("title2", "text2");
//        simple.createPage("title3", "text3");
//        simple.createPage("title4", "text4");
//
//        simple.previewAllPages();
//        System.out.println("------------");
//
//        try {
//            simple.replaceText(3, "nov");
//        } catch (PageNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        simple.previewAllPages();
//        System.out.println("---------");
//
//        try {
//            simple.deleteText(2);
//        } catch (PageNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        simple.previewAllPages();
    }
}
