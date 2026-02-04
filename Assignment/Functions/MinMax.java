package Assignment.Functions;

import java.util.Scanner;

public class MinMax {

    static int min(int x, int y, int z) {
        if (x < y) {
            if (x < z) {
                return x;
            }
        } else if (y < z) {
            if (y < x)
                return y;
        }
        return z;

    }

    static int max(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                return x;
            }
        } else if (y > z) {
            if (y > x)
                return y;
        }
        return z;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the Number 3: ");
        int n3 = sc.nextInt();

        System.out.println("Min: " + min(n1, n2, n3));
        System.out.println("Max: " + max(n1, n2, n3));

    }
}