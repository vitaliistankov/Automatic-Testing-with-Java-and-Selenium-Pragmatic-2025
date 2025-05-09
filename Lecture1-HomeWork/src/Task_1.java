import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A: ");
        double A = sc.nextDouble();

        System.out.println("Enter B: ");
        double B = sc.nextDouble();

        System.out.println("Enter C: ");
        double C = sc.nextDouble();

        if ((C > A && C < B) || (C > B && C < A)) {
            System.out.println(C + " is between " + A + " and " + B);
        } else {
            System.out.println(C + " is something else");
        }

        sc.close();
    }
}