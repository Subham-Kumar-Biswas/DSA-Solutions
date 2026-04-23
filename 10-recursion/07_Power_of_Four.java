// Leetcode - #342 Power of Four
// Input: n = 16
// Output: true

class PowerOfFour {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfFour(int n) {
        return helper(n, 1);
    }

    private static boolean helper(int n, long mul) {
        if (n < mul) {
            return false;
        }

        if (n == mul) {
            return true;
        }

        return helper(n, mul * 4);
    }
}