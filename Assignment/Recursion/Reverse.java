package Assignment.Recursion;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(rev(135));
    }

    static int rev(int num) {
        int digit = (int) (Math.log10(num) + 1);
        if (num % 10 == num) {
            return num;
        }
        return (int) ((num % 10) * Math.pow(10, digit - 1)) + rev(num / 10);
    }
}
