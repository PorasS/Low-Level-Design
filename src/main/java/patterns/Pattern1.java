package patterns;

public class Pattern1 {
    /*
    *      ****
    *      ****
    *      ****
    *      ****
    * */

//    step 1: count the no of lines, and this many times our outer loop will run, here it is 4 lines
//    step 2: At each line check how many stars are there, here in this case there are 4 stars, means
//    inner loop will run for 4 times as well.
//    step 3: Now at each inner loop will print * for 4 times
//    step 4: add a new line

    public static void main(String[] args) {

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
