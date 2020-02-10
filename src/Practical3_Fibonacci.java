public class Practical3_Fibonacci {

    static int fibonacciIterative(int n){
        if (n<=1)
            return 1;

        int fib = 1;
        int prevFib =  1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib = fib + prevFib;
            prevFib = temp;
        }
        return fib;
    }

    static int fibonacciRecursive(int n){
        if (n<=1)
            return n;

        else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }

    }

    public static void main (String args[])
    {
        final long startTime = System.currentTimeMillis();
        int n = 40;
        System.out.println(fibonacciRecursive(n));
        final long elapsedTimeRecursive = System.currentTimeMillis() - startTime;
        System.out.println("the time taken for recursive " + elapsedTimeRecursive);
        final long startTime1 = System.currentTimeMillis();
        System.out.println(fibonacciIterative(n));
        final long elapsedTimeIterative = System.currentTimeMillis() - startTime1;
        System.out.println("the time taken for iterative " + elapsedTimeIterative);
    }


}
