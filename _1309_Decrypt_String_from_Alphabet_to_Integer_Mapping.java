public class _1309_Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static String freqAlphabets(String s) {
        char c = 'j';
        for (int k = 10; k <= 26; k++) {
            s = s.replaceAll(String.valueOf(k) + "#", String.valueOf(c));
            c++;
        }
        c = 'a';
        for (int k = 1; k <= 9; k++) {
            s = s.replaceAll(String.valueOf(k), String.valueOf(c));
            c++;
        }

        return s;
    }

    public static void main(String[] args) {
        String s1 = "10#11#12", s2 = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(s1);
    }
}
