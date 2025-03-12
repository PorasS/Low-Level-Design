package patterns;

public class Pattern8 {

    /*
    * *********
    *  *******
    *   *****
    *    ***
    *     *
    * */

    // step 1 : the outer loop will run for the no of lines, here there are 5 lines
    // step 2 : for inner loop, we can have three loops for space, start, space

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++ ){
                System.out.print(" ");
            }

            for(int k = 0; k < 2*n - (2*i + 1); k++){
                System.out.print("*");
            }

            for(int l = 0; l < i; l++ ){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
