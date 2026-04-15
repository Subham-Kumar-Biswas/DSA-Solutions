// Leetcode - #125 Valid Palindrome
// Input: s = "A man, a plan, a canal: Panama"
// Output: true

class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for (int i = 0; i < s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - i - 1);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}