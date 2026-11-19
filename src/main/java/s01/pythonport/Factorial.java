package s01.pythonport;

/** Section 1: port the Python factorial function here, then add tests in src/test/java/s01/pythonport. */
public class Factorial {
    static long factorial(int n) {
        long result = 1;
        for(long i = 2; i<=n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.err.println(factorial(21));
    }
}
