// Leetcode - #509 Fibonacci Number
// Input: n = 2
// Output: 1

class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if (n == 0 ) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}