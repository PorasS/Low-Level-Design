package patterns;

public class Pattern13 {
    /*
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     *
     *
     * */

    //step 1: Count the number of lines, outer loop will run that many times
    //step 2: print the counter

    public static void main(String[] args) {
        int n = 5;

        int counter = 1;

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(counter+" ");
                counter++;
            }

            System.out.println();
        }
    }
}
