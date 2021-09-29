import java.util.Stack;

public class _1544_Make_The_String_Great {
    public String makeGood(String s) {
        char[] a = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : a) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                char topChar = stack.peek();
                if (c != topChar && Character.toLowerCase(c) == Character.toLowerCase(topChar)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }
        return sb.toString();
    }
}
