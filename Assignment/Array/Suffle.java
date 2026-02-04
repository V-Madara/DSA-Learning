package Assignment.Array;

public class Suffle {
    public int[] shuffle(int[] nums, int n) {
        int temp;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                temp = nums[i];
                nums[i] = nums[n + i];
                nums[n + i] = temp;
            } else {
                temp = nums[i];
                nums[i] = nums[n + i - 1];
                nums[n + i - 1] = temp;
            }
        }
        return nums;
    }
}
