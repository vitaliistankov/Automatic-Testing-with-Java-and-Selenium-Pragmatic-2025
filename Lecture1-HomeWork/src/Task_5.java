import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a != b && b != c && a != c) {
            int max = a;
            int middle = b;
            int min = c;

            // largest
            if (b > max) {
                max = b;
                middle = a;
            }
            if (c > max) {
                max = c;
                middle = b;
                min = a;
            }

            // midlle
            if (b > min && b < max) {
                middle = b;
            } else if (c > min && c < max) {
                middle = c;
            }

            // smallest
            if (a != max && a != middle) {
                min = a;
            }

            System.out.println(max + " " + middle + " " + min);
        } else {
            System.out.println("Numbers can't be equal");
        }
    }
}
