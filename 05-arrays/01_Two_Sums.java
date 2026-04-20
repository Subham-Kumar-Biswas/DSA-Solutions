// LeetCode - #1 Two Sum
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1] because nums[0] + nums[1] = 9

import java.util.Arrays;
import java.util.Scanner;

class TwoSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = 9;
        int[] nums = {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, target)));

        
        scanner.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j };
                }
            }
        }
        return new int[] {};
    }
}