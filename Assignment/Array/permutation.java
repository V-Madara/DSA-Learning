package Assignment.Array;

import java.util.Arrays;

public class permutation {

    public static int[] permut(int ar[]) {
        int temp[] = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[ar[i]];
        }
        return temp;
    }

    public static void main(String[] args) {
        int ar[] = { 5, 0, 1, 2, 3, 4 };
        System.out.println(Arrays.toString(permut(ar)));
    }
}
