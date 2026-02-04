import java.util.ArrayList;
import java.util.Arrays;

public class AllMissingNumbers {
    public static ArrayList<Integer> missingNumber(int[] nums) {
        int i = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        for (i = 0; i < nums.length; i++) {
            if (i + 1 == nums[i]) {
                continue;
            }
            ar.add(i + 1);
        }
        return ar;

    }

    public static int[] swap(int[] nums, int x, int y) {
        int temp;
        temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;

        return nums;
    }

    public static void main(String[] args) {
        int[] ar = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Result: " + missingNumber(ar));
    }
}
