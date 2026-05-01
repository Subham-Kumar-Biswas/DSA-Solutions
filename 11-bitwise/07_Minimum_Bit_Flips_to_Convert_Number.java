// Leetcode - #2220 Minimum Bit Flips to Convert Number
// Input: start = 10, goal = 7
// Output: 3

class MinimumBitsFlips {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        System.out.println(minBitFlips(start, goal));
    }

    public static int minBitFlips(int start, int goal) {
        int count = 0;
        
        while(start != 0 || goal != 0) {
            if((start & 1) != (goal & 1)) {
                count++;
            }
            start >>>= 1;
            goal >>>= 1;
        }
        return count;
    }
}