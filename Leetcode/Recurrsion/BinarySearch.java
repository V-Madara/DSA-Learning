package Leetcode.Recurrsion;

public class BinarySearch {

    public static int search(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (s == e) {
            return mid;
        }
        if (nums[mid] < target) {
            return search(nums, target, mid + 1, e);
        }
        return search(nums, target, s, mid - 1);
    }

    public static void main(String[] args) {
        int[] ar = { 1, 2, 5, 7, 9, 10, 15 };
        System.out.print("Index: " + search(ar, 5, 0, ar.length));
    }
}
