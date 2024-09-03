package FibonacciWithRecurciveApproach;

/*
The code below has time complexity of O(2^n) in the worst case,
O(1) in best case, time complexity is O(n).
 */

public class FibonacciRecursive {
    public static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
