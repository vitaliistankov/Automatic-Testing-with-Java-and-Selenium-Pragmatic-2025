import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count of ns: ");
        int number = scanner.nextInt();

        int count = 0;
        int n = 3; // start from 3

        while (count < n) {
            if (number % 3 == 0) {
                count++;
                if (count == n) {
                    System.out.print(number); // last number w/o comma
                } else {
                    System.out.print(number + ", ");
                }
            }
            number++;


        }
    }
}
