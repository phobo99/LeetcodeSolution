import java.util.HashMap;
import java.util.Map;

public class _781_Rabbits_in_Forest {
    public static int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 0) {
                result += 1;
                continue;
            }
            if (map.get(answers[i]) == null)
                result += answers[i] + 1;
            
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
