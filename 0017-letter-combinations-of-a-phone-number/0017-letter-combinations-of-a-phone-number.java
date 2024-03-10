import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return chad("", digits);
    }

    static List<String> chad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int d = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        if (d == 7 || d == 9) { // Handle digits 7 and 9 separately
            for (int i = (d - 2) * 3; i < (d - 1) * 3 + 1; i++) {
                char ch = (char) ('a' + i);
                if (d == 9) { // Adjust for digit 9
                    if (ch >= 'q') {
                        ch++;
                    }
                }
                list.addAll(chad(p + ch, up.substring(1)));
            }
        } else {
            for (int i = (d - 2) * 3; i < (d - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                if (d >= 8 && d <= 9) { // Skip 'q' and 'z' for digits 8 and 9
                    ch++;
                }
                list.addAll(chad(p + ch, up.substring(1)));
            }
        }
        return list;
    }
}
