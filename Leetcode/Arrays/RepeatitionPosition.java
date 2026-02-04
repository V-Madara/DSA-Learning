import java.util.Arrays;
import java.util.Scanner;

public class RepeatitionPosition {

    public static int[] Positon(int[] array, int target) {
        int[] ans = { -1, -1 };
        ans[0] = binarySearch(array, target, true);
        ans[1] = binarySearch(array, target, false);
        return ans;
    }

    public static int binarySearch(int[] array, int target, boolean startFinding) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        int pot = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                pot = mid;
                if (startFinding) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return pot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Array: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.println("Enter the elements of the Array!");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the targeted element: ");
        int target = sc.nextInt();

        System.out.print("Output: " + Arrays.toString(Positon(nums, target)));
        sc.close();
    }
}
