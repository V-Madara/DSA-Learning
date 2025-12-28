import java.util.ArrayList;
import java.util.Arrays;

public class AllDuplicate {

    public static ArrayList<Integer> allDuplicate(int[] nums) {
        ArrayList<Integer> dup = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                dup.add(nums[i]);
            }
        }
        return dup;
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
        System.out.println("Duplicates: " + allDuplicate(ar));
    }
}
