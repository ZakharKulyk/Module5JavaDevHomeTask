package FibonacciWithIterativeApproach;

/*
The code below has time complexity of O(n)(as the worst case),
O(1) time complexity as the best case
and space complexity always O(1)
 */

public class FibonacciIterative {

    public static long fibonacciIterative(int n) {
        long result = 0;

        if (n <= 1) {
            return n;
        }

        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}
