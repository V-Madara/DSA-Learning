package Assignment.Array;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandy {

    public int max(int[] candies) {
        int mx = candies[0];
        for (int a : candies) {
            if (a > mx) {
                mx = a;
            }
        }
        return mx;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mx = max(candies);
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= mx);
        }
        return result;
    }

    public static void main(String[] args) {
        GreatestCandy ob = new GreatestCandy();
        int ar[] = { 2, 3, 5, 1, 3 };
        System.out.println(ob.max(ar));
        System.out.println(ob.kidsWithCandies(ar, 3));
    }
}
