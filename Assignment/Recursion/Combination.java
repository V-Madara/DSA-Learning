package Assignment.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public List<String> letterCombinations(String digits) {
        String[] sel = { "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };
        String[] up = new String[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            up[i] = sel[(int) (digits.charAt(i)) + 1];
        }
        return helper("", sel);
    }

    private List<String> helper(String p, String[] up) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;

            char ch = up.charAt(0);
            List<String> ans = new ArrayList<>();
            for(int i = 0;i<)
        }
    }
}
