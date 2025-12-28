package Leetcode.Recurrsion;

public class Fibonacai {

    static int fibo(int N) {
        if (N < 2) {
            return 1;
        }
        return fibo(N - 1) + fibo(N - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibo: " + fibo(8 - 1));
    }
}
