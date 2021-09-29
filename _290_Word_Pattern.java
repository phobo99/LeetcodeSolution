import java.util.HashMap;
import java.util.Map;

public class _290_Word_Pattern {
    public boolean wordPattern(String pattern, String s) {
        char[] p = pattern.toCharArray();
        String[] a = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        if (p.length != a.length)
            return false;

        for (int i = 0; i < p.length; i++) {
            char key = p[i];
            String value = a[i];
            if (map.containsKey(key) == false) {
                if (map.containsValue(value) == true) {
                    return false;
                } else {
                    map.put(key, value);
                }
            } else {
                if (map.containsValue(value) == false) {
                    return false;
                } else {
                    if (value.equals(map.get(key)) == false) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
