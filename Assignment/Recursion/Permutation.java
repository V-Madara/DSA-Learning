package Assignment.Recursion;

import java.util.ArrayList;

public class Permutation {
    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutation2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutation2(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    public static void main(String[] args) {
        // permutation("", "abc");
        System.out.println(permutation2("", "abc"));
    }
}
