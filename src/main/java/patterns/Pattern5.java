package patterns;

public class Pattern5 {
    /*
    *  *****
    *  ****
    *  ***
    *  **
    *  *
    * */

    // step 1: count the no of lines for the outer loop, here n = 5
    // step 2: if you can see, the inner loop, goes from 4-3-2-1, its decrementing


    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
