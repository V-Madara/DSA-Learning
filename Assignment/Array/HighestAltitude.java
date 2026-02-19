package Assignment.Array;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int highest = 0, gn = 0;
        for (int i = 0; i < gain.length; i++) {
            gn += gain[i];
            if (highest < gn) {
                highest = gn;
            }
        }
        return highest;
    }
}
