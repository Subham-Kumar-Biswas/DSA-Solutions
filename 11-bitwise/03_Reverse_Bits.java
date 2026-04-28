// Leetcode - #190 Reverse Bits
// Input: n = 43261596
// Output: 964176192

class ReverseBits {
    public static void main (String[] args) {
        int n = 43261596;
        System.out.println(reverseBits(n));
    }

    public static int reverseBits(int n) {
        int temp = n;
        int reversed = 0;
        int i = 0;

        while (i < 32) {
            reversed <<= 1;
            reversed |= (n & 1);
            n >>>= 1;

            i++;
        }

        return reversed;
    }
}