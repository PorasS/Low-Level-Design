package patterns;

public class Pattern20 {
    /*
     * *        *
     * **      **
     * ***    ***
     * ****  ****
     * **********
     * ****  ****
     * ***    ***
     * **      **
     * *        *
     *
     * */

    //step 1:  The outer loop will run for total lines, here is it 9
    //step 2:  The inner loop will run in [*][" "][*] fashion
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            //*
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //" "
            for (int j = 1; j <= (2 * n) - (2 * i); j++) {
                System.out.print(" ");
            }

            //*
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        n = 4;

        for (int i = 1; i <= n; i++) {
            //*
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            //" "
            for (int j = 1; j <= (2 * i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
