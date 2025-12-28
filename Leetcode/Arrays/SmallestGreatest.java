import java.util.Scanner;

public class SmallestGreatest {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length;
        while (start <= end) {
            int mid = start + end / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            } else {
                return letters[mid];
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = sc.nextInt();
        char[] letters = new char[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            letters[i] = sc.nextLine().charAt(0);
        }

        System.out.print(
                "Enter the Targeted element: ");
        char target = sc.nextLine().charAt(0);
        SmallestGreatest ob = new SmallestGreatest();
        System.out.println(ob.nextGreatestLetter(letters, target));

        sc.close();
    }

}