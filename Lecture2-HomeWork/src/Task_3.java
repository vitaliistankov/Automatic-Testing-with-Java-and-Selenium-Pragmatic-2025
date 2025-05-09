public class Task_3 {
    public static void main(String[] args) {

//        for (int i = -10; i <= 10; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

        int i = -10;
        while (i <= 10) {

            // if it is even, then jump it over
            if (i % 2 == 0) {
                i++;
                continue;
            }

            System.out.println(i);  // if it is odd, then print it out
            i++;
        }
    }
}
