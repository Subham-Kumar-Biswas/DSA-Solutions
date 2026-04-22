// Leetcode - #326 Power of Three
// Input: n = 27
// Output: true

class Solution {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        return helper(n, 1);
    }

    private static boolean helper(int n, long mul) {
        if (n < mul) {
            return false;
        }

        if (n == mul) {
            return true;
        }

        return helper(n, mul * 3);
    }
}