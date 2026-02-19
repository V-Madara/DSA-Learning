package Assignment.Array;

public class Nto1 {
    public static void fun(int n) {
        if (n == 1) {
            System.out.print(1);
            return; // Not necessery
        } else {
            System.out.print(n + " ,");
            fun(n - 1);
        }
    }

    public static void main(String[] args) {
        fun(10);
    }

}
