// Leetcode - #231 Power of Two
// Input: n = 16
// Output: true
// Input: n = 3
// Output: false

class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        return helper(n, 1);
    }

    private static boolean helper(int n, long mul) {
        if (n < mul) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        if (n == mul) {
            return true;
        }

        return helper(n, mul * 2);
    }
}