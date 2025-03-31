package patterns;

public class Pattern22 {
    /*
     * 4444444
     * 4333334
     * 4322234
     * 4321234
     * 4322234
     * 4333334
     * 4444444
     * */


    //step 1 : the outer loop will run for (2*n - 1) times
    //step 2: the inner loop will print the min distance
    //the min of top(i), bottom([2*n-1]-i-1), left(j), right([2n-1]-j-1)
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int bottom = (2 * n - 1) - i - 1;
                int left = j;
                int right = (2 * n - 1) - j - 1;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }

            System.out.println();
        }
    }
}
