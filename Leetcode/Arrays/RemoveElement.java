import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        int[] ar = new int[len];
        System.out.println("Enter the Elements in the array!");
        for (int i = 0; i < len; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("Enter the Element to Be removed: ");
        int val = sc.nextInt();
        RemoveElement ob = new RemoveElement();
        System.out.println("K = " + ob.removeElement(ar, val));
        sc.close();
    }

}
