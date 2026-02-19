import java.util.Arrays;

public class MinimumRemovals {

    // int count = 0;

    // public int[] maxMin(int[] nums) {
    // int max = nums[0], min = nums[0];
    // for (int i = 0; i < nums.length; i++) {
    // if (max < nums[i]) {
    // max = nums[i];
    // }
    // if (nums[i] < min) {
    // min = nums[i];
    // }
    // }
    // return new int[] { min, max };
    // // return List.of(10, 20); -> For List Type
    // // return new ArrayList<>(Arrays.asList(10, 20)); -> For Arraylist Type
    // }

    // public int[] removal(int nums[], int del) {
    // int[] newNums = new int[nums.length - 1];
    // for (int i = 0, j = 0; i < nums.length; i++) {
    // if (nums[i] != del)
    // newNums[j++] = nums[i];
    // }
    // return newNums;
    // }

    // public int minRemoval(int[] nums, int k) {
    // int max = maxMin(nums)[1], min = maxMin(nums)[0];
    // if (max <= min * k || nums.length == 0) {
    // return count;
    // } else {
    // if (count % 2 == 0) {
    // nums = removal(nums, max);
    // } else {
    // nums = removal(nums, min);
    // }
    // count++;
    // return minRemoval(nums, k);
    // }
    // }
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int win = n;
        int start = 0, end = n - 1;
        while (start != end) {
            int min = nums[start], max = nums[end];
            for (int i = win; i < n; i++) {
                if (max <= min * k) {
                    return n - (max - min + 1);
                } else {
                    if (end != n) {
                        start += 1;
                        end += 1;
                    } else {
                        start = 0;
                        end = end - 1;
                    }
                }
            }
        }
        return 0;
    }
}
