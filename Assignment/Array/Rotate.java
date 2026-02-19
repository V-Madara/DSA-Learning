package Assignment.Array;

import java.util.Arrays;

public class Rotate {
    public static boolean findRotation(int[][] mat, int[][] target) {
        // We need to check 4 positions: 0, 90, 180, 270 degrees
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            // Rotate mat 90 degrees clockwise for the next iteration
            mat = rotate90(mat);
        }
        return false;
    }

    // Helper function to rotate matrix 90 degrees clockwise
    public static int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // The element at (i, j) moves to (j, n - 1 - i)
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }

    public static void main(String[] args) {
        int[][] ar = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
        int[][] ar2 = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }; // This is ar rotated 180 degrees

        System.out.println("Can rotate: " + findRotation(ar, ar2));
    }
}