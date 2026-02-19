// package Assignment.Array;

// import java.util.ArrayList;
// import java.util.List;

// public class AddToArray {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         List<Integer> nums = new ArrayList<>();
//         System.out.println(getNumber(num, 0));
//         int sum = getNumber(num, 0) + k;
//         sum = reverse(sum);
//         while (sum != 0) {
//             nums.add(sum % 10);
//             sum /= 10;
//         }
//         return nums;

//     }

//     private int reverse(int num) {
//         int rev = 0, r;
//         while (num != 0) {
//             r = num % 10;
//             rev = r + rev * 10;
//             num /= 10;
//         }
//         return rev;
//     }

//     private int getNumber(int[] num, int i) {
//         int number = 0;
//         for (int n : num) {
//             number = number * 10 + n;
//         }
//         return number;
//     }

//     public static void main(String[] args) {
//         AddToArray ob = new AddToArray();
//         int[] arr = { 9, 9, 9, 9, 9, 9 };
//         System.out.println(ob.addToArrayForm(arr, 1));
//     }
// }

package Assignment.Array;

import java.util.ArrayList;
import java.util.List;

public class AddToArray {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        for (int n : num) {
            list.add(n);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            int sum = list.get(i) + k;
            if (sum > 9 && i > 0) {
                list.set(i, sum % 10);
                list.set(i - 1, (list.get(i - 1) + sum / 10));
            } else if (sum > 9 && i == 0) {
                while (sum % 10 != 0) {
                    list.set(i, sum % 10);
                    list.add(0, sum / 10);
                    sum /= 10;
                }
            } else {
                list.set(i, sum % 10);
            }
            k /= 10;
        }
        return list;
    }

    // private int reverse(int num) {
    // int rev = 0, r;
    // while (num != 0) {
    // r = num % 10;
    // rev = r + rev * 10;
    // num /= 10;
    // }
    // return rev;
    // }

    // private int getNumber(int[] num, int i) {
    // int number = 0;
    // for (int n : num) {
    // number = number * 10 + n;
    // }
    // return number;
    // }

    public static void main(String[] args) {
        AddToArray ob = new AddToArray();
        int[] arr = { 1, 2, 0, 0 };
        System.out.println(ob.addToArrayForm(arr, 34));
    }
}
