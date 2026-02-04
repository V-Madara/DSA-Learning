import java.util.Scanner;

public class SmallestLetter {

    public static char nextGreatestLetter(char[] ch, char target) {
        int start = 0, end = ch.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (ch[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ch[start % ch.length];
    }

    public static void main(String[] args) {
        char[] ar = { 'c', 'f', 'j' };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target Element: ");
        char tg = sc.next().charAt(0);
        System.out.print("Result:  " + nextGreatestLetter(ar, tg));
        sc.close();
    }

}
