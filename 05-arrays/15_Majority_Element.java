// Leetcode - #169 Majority Element
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int maxNum = nums[0];
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                maxNum = nums[i];
                count = 1;
            } else if(nums[i] == maxNum) {
                count++;
            } else {
                count--;
            }
        }
        return maxNum;
    }
}