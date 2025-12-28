import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicate2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return 2;
        }
        int count = 2;
        for (int i = 2; i < nums.length; i++)
            if (nums[i] != nums[count - 2]) {
                nums[count] = nums[i];
                count++;
            }

        System.out.print(Arrays.toString(nums));
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the length of array: ");
        // int len = sc.nextInt();
        // int[] ar = new int[len];
        // System.out.println("Enter the Elements in the array!");
        // for(int i = 0;i<len;i++){
        // ar[i] = sc.nextInt();
        // }
        int[] ar = { 0, 0, 1, 1, 1, 2, 3, 3 };
        RemoveDuplicate2 ob = new RemoveDuplicate2();
        System.out.println("K = " + ob.removeDuplicates(ar));
        sc.close();
    }
}