// Leetcode - #1351 Count Negative Numbers in a Sorted Matrix
// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8

class NegativeNumbers {
    public static void main(String[] args) {
        int[][] grid = {
                    {4, 3, 2, -1},
                    {3, 2, 1, -1},
                    {1, 2, -1, -2},
                    {-1, -1, -2, -3}
        };

        System.out.println(countNegative(grid));
    }

    static int countNegative(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int r = 0;
        int c = cols - 1;
        int count = 0;

        while (r < rows && c >= 0) {
            if (grid[r][c] < 0) {
                count += (rows - r);
                c--;
            } else {
                r++;
            }
        }
        return count;
    }
}