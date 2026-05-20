// Leetcode - #1295 Find Numbers with Even Number of Digits
// Input: nums = [12,345,2,6,7896]
// Output: 2

class FindNumbers {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int countEvenDigits = 0;
        for(int i = 0; i < nums.length; i++) {
            int length = String.valueOf(nums[i]).length();
            if(length % 2 == 0) {
                countEvenDigits++;
            }
        }
        return countEvenDigits;
    }
}