package Assignment.Recursion;

public class Pattern1 {

    public static void pattern(int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println("*");
        } else if (c == 1) {
            System.out.println("*");
            pattern(r - 1, r - 1);
        } else {
            System.out.print("* ");
            pattern(r, c - 1);
        }
    }

    public static void main(String[] args) {
        pattern(4, 4);
    }

}
