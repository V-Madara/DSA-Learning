public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int i = 0, pos = 0;
        while (i < nums.length) {
            if (nums[i] >= nums.length) {
                pos = i;
                i++;
            } else {
                swap(nums, i, nums[i]);
                if (i == nums[i]) {
                    i++;
                }
            }
        }
        if (nums[pos] == nums.length) {
            return pos;
        } else {
            return nums.length;
        }
    }

    public static int[] swap(int[] nums, int x, int y) {
        int temp;
        temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;

        return nums;
    }

    public static void main(String[] args) {
        int[] ar = { 0, 4, 2, 1 };
        System.out.println("Result: " + missingNumber(ar));
    }
}
