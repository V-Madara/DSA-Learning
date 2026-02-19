package Assignment.Recursion;

public class NumberOfSteps {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int c) {
        if (num == 0) {
            return c;
        }
        return num % 2 == 0 ? helper(num / 2, ++c) : helper(num - 1, ++c);
    }
}
