package patterns;

public class Pattern14 {

    /*
     *
     * A
     * AB
     * ABC
     * ABCD
     * ABCDE
     *
     * */


    //step 1:  the outer loop will run for total lines, here it is 5
    //step 2: print up to i, increment char

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
