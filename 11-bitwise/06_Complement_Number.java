// Leetcode - #476 Number Complement
// Input: num = 5
// Output: 2

class Solution {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }

    public static int findComplement(int num) {
        int mask = 0;
        int temp = num;

        while(temp != 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        int res = num ^ mask;

        return res;
    }
}