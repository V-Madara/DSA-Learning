package Assignment.Recursion;

public class ZeroCounter {
    public static void main(String[] args) {
        int num = 105300210;
        System.out.println(count(num));
    }

    static int count(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int c) {
        if (num == 0) {
            return c;
        }
        return num % 10 == 0 ? helper(num / 10, ++c) : helper(num / 10, c);
    }
}
