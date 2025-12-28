import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
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
        MoveZeros ob = new MoveZeros();
        ob.moveZeroes(ar);
        sc.close();
    }
}