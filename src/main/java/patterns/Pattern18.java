package patterns;

public class Pattern18 {

    /*
     * E
     * DE
     * CDE
     * BCDE
     * ABCDE
     * */


    //step 1: the outer loop will run for 5 times as there are 5 lines
    //step 2: for inner loop it will run from A+(n-i) to i


    public static void main(String[] args) {

        int n = 26;

        for (int i = 1; i <= n; i++) {
            for (char ch = (char) ('A' + (n - i)); ch <= 'A' + (n - 1); ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
