// Leetcode - #704 Binary Search
// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4

class Solution {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }

    private static int helper(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return helper(nums, target, mid + 1, end);
        } else {
            return helper(nums, target, start, mid - 1);
        }
    }
}