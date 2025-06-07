package bg.pragmatic;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
    private String password;

    public SecuredNotepad(String password) {
        this.password = password;
    }

    private boolean checkPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password:");
        String enteredPassword = scan.nextLine();
        if(enteredPassword.equals(this.password)) {
            System.out.println("Correct password!");
            return true;
        } else {
            System.out.println("Wrong password!");
            return false;
        }
    }

    @Override
    public void createPage(String title, String text) {
        if(checkPassword()) {
            super.createPage(title, text);
        } else {
            System.out.println("Operation createPage wont be executed!");
        }
    }

    @Override
    public void replaceText(int pageNumber, String newText) throws PageNotFoundException {
        if (checkPassword()) {
            super.replaceText(pageNumber, newText);
        } else {
            System.out.println("Operation replaceText wont be executed!");
        }
    }

    @Override
    public void deleteText(int pageNumber) throws PageNotFoundException {
        if (checkPassword()) {
            super.deleteText(pageNumber);
        } else {
            System.out.println("Operation deleteText wont be executed!");
        }
    }

    @Override
    public void previewAllPages() {
        if (checkPassword()) {
            super.previewAllPages();
        } else {
            System.out.println("Operation previewAllPages wont be executed!");
        }
    }

    public String getPassword() {
        return password;
    }

    }
