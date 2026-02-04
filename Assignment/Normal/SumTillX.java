package Assignment.Normal;

import java.util.Scanner;

public class SumTillX {

    // public static int sum(int x)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number or x to end: ");
        String input = sc.next();
        int sum = 0;
        while (input.charAt(0) != 'x') {
            try {
                int num = Integer.valueOf(input);
                sum += num;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.printf("%c is not a choice! %n", input.charAt(0));
            }
            System.out.print("Enter the number or x to end: ");
            input = sc.next();
        }

        System.out.println("Sum of the Numbers: " + sum);
        sc.close();
    }

}
