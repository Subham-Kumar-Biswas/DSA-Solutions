// Leetcode - #137 Single Number II
// Input: nums = [2,2,3,2]
// Output: 3

import java.util.Arrays;

class SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i <= 31; i++) {
            int count = 0;
            for(int num:nums) {
                if(((num >> i) & 1) == 1) {
                    count++;
                }
            }
            if((count % 3) != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
}