// Leetcode - #1572 Matrix Diagonal Sum
// Input: mat = [[1,2,3],
//               [4,5,6],
//               [7,8,9]]
// Output: 25

class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                  {1, 2, 3},
                  {4, 5, 6},
                  {7, 8, 9}
                };

        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i < mat.length; i++) {
            sum += mat[i][i];

            sum += mat[i][n - 1 -i];
        }

        if(n % 2 != 0) {
            int mid = n/2;
            sum -= mat[mid][mid];
        }
        return sum;
    }
}