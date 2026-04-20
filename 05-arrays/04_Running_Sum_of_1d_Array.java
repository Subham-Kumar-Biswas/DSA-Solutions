// Leetcode - #1480 Running of 1d Array
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]

import java.util.Arrays;

class SumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = runningSum(nums);

        System.out.println(Arrays.toString(result));
    }
    

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
