// Leetcode - #905 Sort Array By Parity
// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]

import java.util.Arrays;

class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int Switch = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[Switch];
                nums[Switch] = temp;
                Switch++;
            }
        }
        return nums;
    }
}