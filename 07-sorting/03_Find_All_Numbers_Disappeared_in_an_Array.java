// Leetcode - #448 Find All Numbers Disappeared in an Array
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

import java.util.ArrayList; 
import java.util.List;      

class Solution {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result); 
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1 ) {
                list.add(j + 1);
            }
        }

        return list;
    }

    public static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}