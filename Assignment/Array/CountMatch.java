package Assignment.Array;

import java.util.List;

public class CountMatch {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type")) {
                boolean isPresent = items.get(i).get(0).equals(ruleValue);
                System.out.println(isPresent);
                System.out.println(items.get(i).get(0));
                if (isPresent) {
                    counter += 1;
                }
            } else if (ruleKey.equals("color")) {
                boolean isPresent = items.get(i).get(1).equals(ruleValue);
                if (isPresent) {
                    counter += 1;
                }
            }
            if (ruleKey.equals("name")) {
                boolean isPresent = items.get(i).get(2).equals(ruleValue);
                if (isPresent) {
                    counter += 1;
                }
            }
        }
        return counter;
    }
}
