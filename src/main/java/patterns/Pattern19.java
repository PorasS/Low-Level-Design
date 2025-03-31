package patterns;

public class Pattern19 {

    /*
     * **********
     * ****  ****
     * ***    ***
     * **      **
     * *        *
     * *        *
     * **      **
     * ***    ***
     * ****  ****
     * **********
     * */


    //step 1 : the outer loop will run for total no of lines, lets divide the pattern into two parts, first 5 lines
    //and next 5 lines

    //First 5 lines
    //step 2 : for first 5 lines, the inner loop will run as [*] [ ] [*], where [*] will print for n-i, i as 0 index
    // then [ ] for n*i times, then [*] for n-i times

    //next 5 lines
    //step 2: inner loop for print * will run up to i, i as 1 index
    //inner loop for space will run up to [(2*n) - (2*i)]


    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            //print *
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            //print " "
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }

            //print *
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = 1; i <= n; i++) {
            //print *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //print " "
            for (int j = 1; j <= (2 * n) - (2 * i); j++) {
                System.out.print(" ");
            }

            //print *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
