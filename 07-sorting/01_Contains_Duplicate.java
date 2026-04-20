// Leetcode - #217 Contains Duplicate
// Input: nums = [1,2,3,1]
// Output: true

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
        
    }

    public static boolean containsDuplicate(int[] nums) {
        int[] sortedArr = bubble(nums);

        for (int i = 0; i < sortedArr.length - 1; i++) {
            if (sortedArr[i] == sortedArr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int[] bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }
}