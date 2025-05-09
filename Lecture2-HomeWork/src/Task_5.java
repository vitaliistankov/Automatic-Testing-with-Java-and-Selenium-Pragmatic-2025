import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first n: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int n2 = scanner.nextInt();

        int start = n1;
        int end = n2;

        // Checking which is smaller which is larger

        if (n1 > n2) {
            start = n2;
            end = n1;
        }

        // Print numbers from smaller to larger

        for (int i = start; i <= end; i++) {
            System.out.println(i);

        }
    }
}