package Assignment.Array;

public class DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum+= (mat[i][i]+mat[i][n-1-i]);
        }
        sum = sum - mat[n / 2][n / 2];
        return sum;
    }
}
