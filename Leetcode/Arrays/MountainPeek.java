public class MountainPeek {

    public static int peekSearch(int[] ar) {
        int start = 0;
        int end = ar.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (ar[mid] < ar[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return ar[end];
    }

    public static void main(String[] args) {
        int[] ar = { 0, 3, 5, 6, 7, 4, 3, 4, 2, 1 };
        System.out.println(peekSearch(ar));
    }
}
