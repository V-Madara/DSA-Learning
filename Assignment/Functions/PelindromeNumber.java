package Assignment.Functions;

import java.util.Scanner;

public class PelindromeNumber {
    static boolean pelindromeNumber(int num) {
        int rev = 0, r = 0, org = num;
        while (num != 0) {
            r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        return rev == org;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println("Is Pelindrome: " + pelindromeNumber(num));
    }
}
