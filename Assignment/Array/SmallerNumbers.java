package Assignment.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerNumbers {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // Creating an arraylist
        int[] ar = new int[101];

        // Creating a resulting array
        int[] result = new int[nums.length];

        // Counting Frequency of Each Elements
        for (int i = 0; i < nums.length; i++) {
            System.out.println(ar[nums[i]]++);
            // ar[nums[i]]++;
        }

        System.out.println("Sum Prefex");
        // Prefix Sum
        for (int i = 1; i < 101; i++) {
            System.out.println(ar[i] += ar[i - 1]);
            // ar[i] += ar[i - 1];
        }

        // finding Result
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = ar[nums[i] - 1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // 1. Create a Scanner to read input from the command line
        Scanner scanner = new Scanner(System.in);

        // 2. Ask user for the size of the array
        System.out.print("Enter the number of elements (N): ");
        int n = scanner.nextInt();

        // 3. Initialize the array and read elements
        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers (values between 0 and 100):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // 4. Create an instance of the Solution class and call the method
        SmallerNumbers solution = new SmallerNumbers();
        int[] result = solution.smallerNumbersThanCurrent(nums);

        // 5. Print the results clearly
        System.out.println("\n--- Results ---");
        System.out.println("Input Array:  " + Arrays.toString(nums));
        System.out.println("Output Array: " + Arrays.toString(result));

        // Close scanner
        scanner.close();
    }

}
