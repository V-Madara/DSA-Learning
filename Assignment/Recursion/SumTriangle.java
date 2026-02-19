package Assignment.Recursion;

import java.util.Arrays;

public class SumTriangle {

    public static void printTriangle(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int[] temp = new int[nums.length - 1];
        temp = helper(nums, temp, 0, 0);
        printTriangle(temp);
        System.out.println(Arrays.toString(temp));
    }

    public static int[] helper(int[] nums, int[] temp, int i, int j) {
        if (j == temp.length) {
            return temp;
        }
        temp[j] = nums[i] + nums[i + 1];
        return helper(nums, temp, ++i, ++j);
    }

    public static void main(String[] args) {
        // input Array
        int[] x = { 1, 2, 3, 4, 5 };
        // Recursive function that will print answer
        printTriangle(x);
        System.out.println(Arrays.toString(x));
    }
}
