

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println("before swap:");
        System.out.println("first " + first);
        System.out.println("second " + second);

        //adding temp variable for swap

        int temp = first;
        first = second;
        second = temp;

        System.out.println("after swap:");
        System.out.println();
        System.out.println("first " + first);
        System.out.println("second " + second);


    }





}
