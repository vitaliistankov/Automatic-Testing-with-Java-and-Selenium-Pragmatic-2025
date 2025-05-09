import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        double money = scanner.nextDouble();
        boolean isHealthy = scanner.nextBoolean();

        if (!isHealthy) {
            System.out.println("Won't go out coz I'm sick");
        } else {
            if (money >= 10) {
                System.out.println("Will go for a coffee");
            } else if (money < 10 && hour >= 9 && hour <= 18) {
                System.out.println("Going to buy some medicine");
            } else {
                System.out.println("Stay home");
            }
        }
    }
}
