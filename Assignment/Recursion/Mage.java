package Assignment.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Mage {

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + "D", r - 1, c);
        }
        if (c > 1) {
            path(p + "R", r, c - 1);
        }
    }

    static void allPath(String p, int r, int c, boolean[][] mage, int[][] path, int stage) {
        if (r == mage.length - 1 && c == mage[0].length - 1) {
            path[r][c] = stage;
            for (int[] ar : path) {
                System.out.println(Arrays.toString(ar));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!mage[r][c]) {
            return;
        }
        mage[r][c] = false;
        path[r][c] = stage;
        if (r > 0) {
            allPath(p + "U", r - 1, c, mage, path, stage + 1);
        }
        if (c > 0) {
            allPath(p + "L", r, c - 1, mage, path, stage + 1);
        }
        if (r < mage.length - 1) {
            allPath(p + "D", r + 1, c, mage, path, stage + 1);
        }
        if (c < mage[0].length - 1) {
            allPath(p + "R", r, c + 1, mage, path, stage + 1);
        }
        mage[r][c] = true;
        path[r][c] = 0;
    }

    static ArrayList<int[][]> list = new ArrayList<>();
    static ArrayList<Integer> stages = new ArrayList<>();
    static ArrayList<String> dirn = new ArrayList<>();

    static void mageSolver(String p, int r, int c, boolean[][] mage, int[][] path, int stage) {
        // BASE CASE
        if (r == mage.length - 1 && c == mage[0].length - 1) {
            path[r][c] = stage;

            // Deep copy the array so we don't save a blank array
            int[][] pathCopy = new int[path.length][path[0].length];
            for (int i = 0; i < path.length; i++) {
                pathCopy[i] = Arrays.copyOf(path[i], path[i].length);
            }
            list.add(pathCopy);
            stages.add(stage);
            dirn.add("S" + p + "E");

            // Backtrack the final cell before returning
            path[r][c] = 0;
            return;
        }

        if (!mage[r][c]) {
            return;
        }

        mage[r][c] = false;
        path[r][c] = stage;

        // Ensure all these call 'mageSolver' and not 'allPath'
        if (r > 0) {
            mageSolver(p + "U", r - 1, c, mage, path, stage + 1);
        }
        if (c > 0) {
            mageSolver(p + "L", r, c - 1, mage, path, stage + 1);
        }
        if (r < mage.length - 1) {
            mageSolver(p + "D", r + 1, c, mage, path, stage + 1);
        }
        if (c < mage[0].length - 1) {
            mageSolver(p + "R", r, c + 1, mage, path, stage + 1);
        }

        mage[r][c] = true;
        path[r][c] = 0;
    }

    private static int min(ArrayList<Integer> stages) {
        // FIX: Start index at 0 to prevent IndexOutOfBoundsException
        int index = 0;
        try {
            int min = stages.get(0);
            for (int i = 0; i < stages.size(); i++) {
                if (min > stages.get(i)) {
                    min = stages.get(i);
                    index = i;
                }
            }
            return index;
        } catch (Exception e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        // System.out.println(count(4, 4));
        // path("", 4, 4);
        boolean[][] mage = {
                { true, true, true, true, true },
                { true, false, true, false, true },
                { false, false, false, false, false }, // The Great Wall
                { true, true, true, true, true },
                { true, false, true, false, true }
        };
        // boolean[][] mage = {
        // { true, true, true, true, false, true, true },
        // { true, false, false, true, true, true, false },
        // { true, true, true, false, true, false, true },
        // { false, false, true, true, true, true, true },
        // { true, true, true, false, false, false, true }
        // };
        // boolean[][] mage = {
        // { true, true, true, false, true, true },
        // { true, false, true, true, true, false },
        // { true, true, false, true, true, true },
        // { false, true, true, false, false, true },
        // { true, true, false, true, true, true },
        // { true, true, true, true, false, true }
        // };
        // boolean[][] mage = {
        // { true, true, false, true, true },
        // { false, true, true, true, false },
        // { true, false, false, true, true },
        // { true, true, true, false, true },
        // { false, false, true, true, true }
        // };
        // boolean[][] mage = {
        // { true, true, true },
        // { true, true, true },
        // { true, true, true }
        // };
        int[][] path = new int[mage.length][mage[0].length];
        // allPath("", 0, 0, mage, path, 1);
        mageSolver("", 0, 0, mage, path, 1);
        int index = min(stages);
        if (index == -1) {
            System.out.println("Impossible Maze No Way Found to Reach End!!");
            System.exit(0);
        }
        for (int[] ar : list.get(index)) {
            System.out.println(Arrays.toString(ar));
        }
        System.out.println(dirn.get(index) + " :  " + stages.get(index));
    }
}
