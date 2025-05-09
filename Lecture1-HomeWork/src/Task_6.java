import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        //swapping
        int temp = a1;
        a1 = a2;
        a2 = a3;
        a3 = temp;

        // new values
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);


    }
}
