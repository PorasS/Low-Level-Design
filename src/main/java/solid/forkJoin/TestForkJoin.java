package solid.forkJoin;

public class TestForkJoin {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci(18);
        System.out.println(f.compute());
    }
}
