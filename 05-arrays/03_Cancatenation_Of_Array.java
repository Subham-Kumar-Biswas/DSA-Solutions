// Leetcode - #1929 Concatenation of Array
// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]

import java.util.Arrays;

class Cancatenation_Of_Array {
    public static void main(String[] args) {
    int[] nums = {1, 2, 1};
    
    int[] result = getConcatenation(nums);

    System.out.println(Arrays.toString(result));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * (nums.length)];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
