package patterns;

public class Pattern12 {
    /*
     * 1------1
     * 12----21
     * 123--321
     * 12344321
     * */


//    step 1: count the lines, outer loop run those many lines
    //step 2: number space number


    public static void main(String[] args) {
        int n = 4;

        int space = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }


            space -= 2;

//            for (int j = 1; j <= 2 * n; j++) {
//                if (j <= i) {
//                    System.out.print(j);
//                } else if (j >= (2 * n - i + 1)) {
//                    System.out.print((2 * n - j) + 1);
//                } else {
//                    System.out.print(" ");
//                }
//            }

            System.out.println();
        }
    }
}
