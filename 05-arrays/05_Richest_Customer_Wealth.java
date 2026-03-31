// Leetcode - #1672 Richest Customer Wealth
// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10

class Solution {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};

        System.out.print(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}