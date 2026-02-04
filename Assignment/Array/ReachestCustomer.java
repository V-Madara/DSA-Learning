package Assignment.Array;

public class ReachestCustomer {

    static int i = 0;
    // public int maximumWealth(int[][] accounts) {
    // for(int i = 0;i<accounts.length;i++){
    // for(int j = 0; j<accounts[i].length;j++){

    // }
    // }
    // }
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        if (i == accounts.length)
            return 0;
        else {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            i++;
            return Math.max(sum, maximumWealth(accounts));
        }
    }

    public static void main(String[] args) {
        int ar[][] = { { 1, 5 }, { 7, 3 }, { 5, 3 } };
        System.out.println(maximumWealth(ar));
    }

}
