// Leetcode - #1920 Build Array From Permutation
// Input: nums = [0,2,1,5,3,4]
// Output: [0,1,2,4,5,3]

class Solution {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };

        int[] result = buildArray(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;

    }

}