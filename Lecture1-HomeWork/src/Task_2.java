import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int suma = a + b;
        int razlika = a - b;
        int proizvedenie = a*b;
        int delenie = a/b;
        int ostatok = a%b;

//        double suma = a + b;
//        double razlika = a - b;
//        double proizvedenie = a*b;
//        double delenie = a/b;
//        double ostatok = a%b;

        System.out.println("suma: " + suma);
        System.out.println("razlika: " + razlika);
        System.out.println("proizvedenie: " + proizvedenie);
        System.out.println("delenie: " + delenie);
        System.out.println("ostatok: " + ostatok);

    }
}
