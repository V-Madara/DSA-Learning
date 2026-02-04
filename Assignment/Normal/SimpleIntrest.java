package Assignment.Normal;

import java.util.Scanner;

public class SimpleIntrest {

    public static double Intrest(int p, int r, int t) {
        return p * r * t / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        int amt = sc.nextInt();
        System.out.print("Enter the Rate Percent: ");
        int rate = sc.nextInt();
        System.out.print("Enter the Time: ");
        int time = sc.nextInt();

        System.out.printf("Simple Intrest: %.2f", Intrest(amt, rate, time));
        sc.close();
    }
}
