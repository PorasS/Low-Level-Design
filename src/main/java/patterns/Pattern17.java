package patterns;

public class Pattern17 {
    /*
     *    A
     *   ABA
     *  ABCBA
     * ABCDCBA
     *
     * */


    //roadmap
    //we space char space
    //n=4
    //i = 1, 3space, 1char, 3space -> (n-i)space,  i+=2 char(post increment) ,(n-i)space
    //i = 2, 2space, 3char, 2space -> ABA
    //i = 3, 1space, 5char, 1space -> ABCBA up to i is increment char, char j - 2
    //i = 4, 0space, 7char, 0space -> ABCDCBA

    //A = 65 + 1  = 66
    //66 + 2 = 68 -> 65 66 67 -> ABC
    //68 + 2 = 70 -> 65 66 67 68 69
    //70 + 2 = 72 -> 65 66 67 68 69 70 71


    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            //print char
            char ch = 'A';
            int mid = (2 * i + 1) / 2;
            for (int j = 1; j <= (2 * i) + 1; j++) {
                if (j <= mid) {
                    System.out.print(ch++);
                } else {
                    System.out.print(ch--);
                }
            }

            //space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
