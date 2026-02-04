import java.util.Arrays;

public class FindDuplicate {
    public static int repeated(int[] nums) {
        int rep = -1, i = 0;
        while (i < nums.length) {
            if (nums[i] == nums[nums[i] - 1]) {
                rep = i;
                return rep;
            }
            if (nums[i] != i + 1 && rep == -1) {
                swap(nums, nums[i] - 1, i);
            } else {
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return rep;
    }

    public static int[] swap(int[] nums, int x, int y) {
        int temp;
        temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;

        return nums;
    }

    public static void main(String[] args) {
        int[] ar = { 1, 3, 4, 2, 2 };
        System.out.println("REP: " + repeated(ar));
    }

}
