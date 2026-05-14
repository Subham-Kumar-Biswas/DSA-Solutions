// Leetcode - #283 Move Zeroes
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

import java.util.Arrays;

class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int countNonZeroes = 0;
        int countZeroes = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[countNonZeroes] = nums[i];
                countNonZeroes++;
            } else {
                countZeroes++;
            }
        }

        while(countZeroes > 0) {
            nums[nums.length - countZeroes] = 0;
            countZeroes--;
        }
    }
}