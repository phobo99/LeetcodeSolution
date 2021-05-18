public class _824_Goat_Latin {
    public static String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        String[] arr = S.split(" ");
        int n = arr.length;
        String t = "a";


        for (int i = 0; i < n; i++) {
            char c = arr[i].charAt(0);
            if (c == 'a' || c == 'A'
                    || c == 'e' || c == 'E'
                    || c == 'i' || c == 'I'
                    || c == 'o' || c == 'O'
                    || c == 'u' || c == 'U') {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i].substring(1));
                sb.append(arr[i].charAt(0));
            }
            sb.append("ma");
            sb.append(t);
            t = t + 'a';
            if (i + 1 != arr.length) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String sentence1 = "I speak Goat Latin";
        String sentence2 = "The quick brown fox jumped over the lazy dog";
        System.out.println(toGoatLatin(sentence1));
        System.out.println(toGoatLatin(sentence2));
    }
}
