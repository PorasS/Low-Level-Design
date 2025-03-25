package patterns;

public class Pattern15 {
    /*
     * A B C D E
     * A B C D
     * A B C
     * A B
     * A
     *
     * */

    //step 1 : outer loop will run up to total lines
    //step 2 : inner row will run in reverse order

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch < ('A' + n) - i; ch++) {
                System.out.print(ch+" ");
            }

            System.out.println();
        }

    }
}
