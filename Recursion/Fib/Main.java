/*
* Given n, return the nth term of the Fibonacci sequence.
* HINT: This problem is possible to complete in O(n) time complexity with the use of arrays.
*
* Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
* Examples:
* fib(1) = 0
* fib(2) = 1
* fib(3) = 1
* fib(9) = 21
* */

public class Main {

    public static void main(String[] args) {
        Check.check();
    }

    public static int fib(int n) {

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
           arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[arr.length - 1];
    }
}
