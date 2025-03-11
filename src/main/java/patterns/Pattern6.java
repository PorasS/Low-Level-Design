package patterns;

public class Pattern6 {

    /*
    *   12345
    *   1234
    *   123
    *   12
    *   1
    * */

    // step 1 : the outer loop will run for 5 times, as the total lines are 5
    // step 2: for inner loop, if you can see the inner loop is decrementing

    public static void main(String[] args) {
        int n = 5;
       for(int i = 0; i < n; i++){
           for(int j = 1; j <= n-i; j++){
               System.out.print(j);
           }

           System.out.println();
       }
    }
}
