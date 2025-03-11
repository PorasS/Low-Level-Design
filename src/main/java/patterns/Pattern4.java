package patterns;

public class Pattern4 {
    /*
    * 1
    * 22
    * 333
    * 4444
    * 55555
    * */


    //step 1: the outer loop will run for no of lines, here there are 5 lines
    //step 2: for inner loop at each iteration, will print only ith value for i times

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
