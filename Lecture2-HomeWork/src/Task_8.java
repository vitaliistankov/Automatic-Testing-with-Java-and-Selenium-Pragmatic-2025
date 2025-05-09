import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows:");
        int maxRow = sc.nextInt();

        int col = 1;
        int n = 0;
        int row = 1;

        while(row <= maxRow){
            col = 1;
            n = row;
            while(col <= maxRow){
                System.out.print(n + " ");
                n = n + row;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}

