public class TailRecursionTest {

    static int countDown(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDown(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(countDown(15000));
    }
}