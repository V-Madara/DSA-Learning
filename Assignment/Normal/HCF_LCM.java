package Assignment.Normal;

import java.util.Scanner;

public class HCF_LCM {

    // public static int hcf(int num1, int num2) {
    // if (num2 == 0) {
    // return Math.abs(num1);
    // }
    // return hcf(num2, num1 % num2);
    // }

    public static int hcf(int num1, int num2) {
        int fact = 1;
        for (int i = 1; i <= Math.max(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                fact *= i;
            }
        }
        return fact;
    }

    public static int lcm(int num1, int num2) {
        int fact = 1, i = 2;
        while (num1 > 1 || num2 > 1) {
            if (num1 % i == 0 || num2 % i == 0) {
                fact *= i;
                if (num1 % i == 0)
                    num1 /= i;
                if (num2 % i == 0)
                    num2 /= i;
            } else {
                i++;
            }

        }
        return fact;
    }

    // public static int lcm(int num1, int num2) {
    // int max = (num1 > num2) ? num1 : num2;
    // while (true) {
    // if (max % num1 == 0 && max % num2 == 0) {
    // break;
    // } else {
    // max++;
    // }
    // }
    // return max;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Result HCF: " + hcf(num1, num2));
        System.out.println("Result LCM: " + lcm(num1, num2));
        sc.close();
    }
}
