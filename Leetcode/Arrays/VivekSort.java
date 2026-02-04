import java.util.Arrays;
import java.util.Scanner;

public class VivekSort {

    public static void mergeArray(int[] ar1, int m, int[] ar2, int n) {
        int[] ar = new int[m + n];
        for (int i = 0; i < m; i++) {
            ar[i] = ar1[i];
        }
        for (int i = m; i < m + n; i++) {
            ar[i] = ar2[i - m];
        }
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the len of array 1: ");
        int m = sc.nextInt();
        System.out.print("Enter the len of array 2: ");
        int n = sc.nextInt();
        int[] ar1 = new int[m + n];
        int[] ar2 = new int[n];
        System.out.println("Enter the elements in array1: ");
        for (int i = 0; i < m; i++) {
            ar1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in array2: ");
        for (int i = 0; i < n; i++) {
            ar2[i] = sc.nextInt();
        }
        mergeArray(ar1, m, ar2, n);
        sc.close();
    }
}
