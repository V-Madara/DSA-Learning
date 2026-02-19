package Assignment.Recursion;

public class DigitSum {
    public static void main(String args[]) {
        int ans = digitSum(1814653);
        System.out.print(ans);
    }

    static int digitSum(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + digitSum(num / 10);
    }

}
