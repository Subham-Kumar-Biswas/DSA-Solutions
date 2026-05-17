// Leetcode - #2389 Longest Subsequence With Limited Sum
// Input: nums = [4,5,2,1], queries = [3,10,21]
// Output: [2,3,4]

import java.util.Arrays;

class AnswerQueries {
    public static void main(String[] args) {
        int[] nums = {4,5,2,1};
        int[] queries  = {3,10,21};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++) {
            int current = queries[i];
            int sum = 0;
            int count = 0;

            for(int j = 0; j < nums.length; j++) {
                if(sum + nums[j] <= current) {
                    sum += nums[j];
                    count++;
                } else {
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}