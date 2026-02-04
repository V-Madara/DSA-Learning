package Assignment.Functions;

import java.util.Scanner;

public class Triplet {
    static boolean isTriplet(int num1, int num2, int num3) {
        return num3 * num3 < num2 * num2 + num1 * num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Number2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Number3: ");
        int num3 = sc.nextInt();

        System.out.println("Is Triplet: " + isTriplet(num1, num2, num3));
    }
}
