package patterns;

public class Pattern16 {

    /*
     * A
     * BB
     * CCC
     * DDDD
     * EEEEE
     * */


    //step 1: the outer loop will run for total no of lines, here 5 lines
    //step 2: print the char ands increment, the inner loop will run for i times


    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
