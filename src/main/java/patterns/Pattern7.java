package patterns;

public class Pattern7 {

    /*
    *     *
    *    ***
    *   *****
    *  *******
    * *********
    * */

    // step 1: the outer loop will run for 5 times as there are 5 lines.
    // step 2: focus on the columns, there are 9 columns here, and we are printing [space, start, space]
    // [n-i-1, 2*n+1, n-i-1], so there are three inner loops, first will print space, then will print start
    // then will print the space again

    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i < n; i++){
            //print space
            for(int j = 0; j < (n-i-1); j++){
                System.out.print(" ");
            }

            //print *
            for(int k = 0; k < (2*i+1); k++){
                System.out.print("*");
            }

            //print space
            for(int l = 0; l < (n-i-1); l++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
