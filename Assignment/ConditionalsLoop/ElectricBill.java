package Assignment.ConditionalsLoop;

import java.util.Scanner;

public class ElectricBill {

    public static double bill(int newUnit, int oldUnit, int perUnit) {
        int amt = perUnit * (newUnit - oldUnit);
        return amt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the New Units: ");
        int newUnit = sc.nextInt();
        System.out.print("Enter the Old Units: ");
        int oldUnit = sc.nextInt();
        System.out.print("Enter the Rate Per Units: ");
        int perUnit = sc.nextInt();
        System.out.printf("Bill : %.2f", bill(newUnit, oldUnit, perUnit));
        sc.close();
    }
}
