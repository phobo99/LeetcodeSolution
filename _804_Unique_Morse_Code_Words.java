import java.util.HashSet;
import java.util.Set;

public class _804_Unique_Morse_Code_Words {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> morseSet = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            char[] charArr = word.toCharArray();
            for (char c : charArr) {
                sb.append(morse[c - 'a']);
            }
            morseSet.add(sb.toString());
        }
        return morseSet.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
