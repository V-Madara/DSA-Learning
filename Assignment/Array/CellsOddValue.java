package Assignment.Array;

public class CellsOddValue {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int counter = 0;
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] += 1;
            }
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] += 1;
            }
        }
        for (int ar[] : matrix) {
            for (int ele : ar) {
                if (ele % 2 != 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
