package patterns;

public class Pattern3 {


    /*
     *  1
     *  12
     *  123
     *  1234
     *  12345
     *
     * */

    // step 1: there are total 5 lines, therefore the outer loop will run for 5 times
    // step 2: at each inner loop will run from for j=1, to i and print j

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
