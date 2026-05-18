// Leetcode - #27 Remove Element
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]

import java.util.Arrays;

class Main {
    static class RemoveElement {
        public int removeElement(int[] nums, int val) {
            int index = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }
    }

    public static void main(String[] args) {
        RemoveElement solver = new RemoveElement();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Value to remove: " + val);

        int newLength = solver.removeElement(nums, val);

        System.out.println("\n--- Results ---");
        System.out.println("Returned length (k): " + newLength);
        
        System.out.print("Modified array (first " + newLength + " elements): [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}