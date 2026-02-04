package Assignment.Array;

import java.util.Arrays;

public class Concatination {

    public static int[] concat(int[] nums) {
        int[] temp = new int[2 * nums.length];
        for (int i = 0; i < temp.length; i++) {
            if (i < nums.length) {
                temp[i] = nums[i];
            } else {
                temp[i] = nums[i - nums.length];
            }
        }
        return temp;
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2 * n];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }

    public static void main(String[] args) {
        int ar[] = { 1, 3, 2, 1 };
        System.out.println(Arrays.toString(concat(ar)));
        System.out.println(Arrays.toString(getConcatenation(ar)));
    }
}
