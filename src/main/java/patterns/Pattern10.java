package patterns;

public class Pattern10 {
    /*
    *
    * *
    * **
    * ***
    * ****
    * *****
    * ****
    * ***
    * **
    * *
    * */

    //step 1: count the no of lines, the outer loop will run that many times
    //step 2: the inner loop is printing * and space, where * in increment at each level up to level 4 (0 index)
    //after than the * are decrementing again
    public static void main(String[] args) {
        //trick : print first 5 lines
        //then print remaining lines

        int n = 5;

        for(int i = 1; i <= (2*n - 1); i++){
            int star = i;

            if(i > n){
                star = 2*n - i;
            }

            for(int j = 1; j <= star; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
