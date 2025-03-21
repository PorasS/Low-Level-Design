package patterns;

public class Pattern11 {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {

            int start = i % 2 == 1 ? 1 : 0;

            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();
        }
    }
}
