// Leetcode - #26 Remove Duplicates from Sorted Array
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]

import java.util.Arrays;

class Main {
    static class RemoveDuplicates {
        public int removeDuplicates(int[] nums) {
            int insertIndex = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicates solver = new RemoveDuplicates();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("Original array: " + Arrays.toString(nums));

        int uniqueCount = solver.removeDuplicates(nums);

        System.out.println("\n--- Results ---");
        System.out.println("Number of unique elements (k): " + uniqueCount);
        
        System.out.print("Modified array (first " + uniqueCount + " elements): [");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i]);
            if (i < uniqueCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println("Full array in memory: " + Arrays.toString(nums));
    }
}