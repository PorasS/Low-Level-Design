package patterns;

public class Pattern21 {
    /*
     * ****
     * *  *
     * *  *
     * *  *
     * ****
     *
     * */


    //Step 1 : There are 5 lines, so outer loop will run for 5 times
    //Step 2 : the 1 and the last inner loop will run with 0 space
    //step 3 : In between 1 * followed by (n - 2  - 1) spaces, followed by 1 star
    public static void main(String[] args) {


        int n = 5;

        for (int i = 1; i <= 5; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= n - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
