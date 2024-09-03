package FibonacciWithDynamicApproach;

import java.util.HashMap;
/*
The code below has time complexity of O(n)(as the worst case),
O(1) time complexity as the best case
and space complexity  O(n)
 */

public class FibonacciDynamic {

    private static HashMap<Integer, Long> map = new HashMap<>();

    public static long fibonacciDynamic(int n) {

        if (n <= 1) {
            return n;
        }

        if (map.containsKey(n)) {
           return map.get(n);
        }

        Long result = fibonacciDynamic(n - 1) + fibonacciDynamic(n - 2);

        map.put(n, result);

        return result;
    }
}
