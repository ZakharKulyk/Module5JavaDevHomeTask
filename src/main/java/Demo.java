import FibonacciWithDynamicApproach.FibonacciDynamic;
import FibonacciWithIterativeApproach.FibonacciIterative;
import FibonacciWithRecurciveApproach.FibonacciRecursive;

public class Demo {

    public static void main(String[] args) {
        System.out.println(FibonacciIterative.fibonacciIterative(6));
        System.out.println(FibonacciRecursive.fibonacciRecursive(7));
        System.out.println(FibonacciDynamic.fibonacciDynamic(6));
    }
}
