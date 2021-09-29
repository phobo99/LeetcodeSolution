import java.util.HashMap;
import java.util.Map;

public class _409_Longest_Palindrome {
    public int longestPalindrome(String s) {
        char[] a = s.toCharArray();
        Map<Character, Integer> count = new HashMap<>();

        for (char c : a
        ) {
            if (count.containsKey(c) == false) {
                count.put(c, 1);
            } else {
                int newSoLan = count.get(c) + 1;
                count.put(c, newSoLan);
            }
        }
        int result = 0;
        for (Map.Entry e : count.entrySet()
        ) {
            int soLanXuatHien = (int) e.getValue();
            if (soLanXuatHien % 2 == 0) {
                result += soLanXuatHien;
            } else {
                result += soLanXuatHien - 1;
            }
        }
        if (s.length() - result > 0) {
            result++;
        }
        return result;
    }
}
