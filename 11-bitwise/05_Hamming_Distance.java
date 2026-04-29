// Leetcode - #461 Hamming Distance
// Input: x = 1, y = 4
// Output: 2

class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x, y));
    }

    public static int hammingDistance(int x, int y) {
        int z = x ^ y;
        int count = 0;
        while (z != 0) {
            if((z & 1) == 1) {
                count++;
            }
            z >>>= 1;
        }
        return count;
    }
}