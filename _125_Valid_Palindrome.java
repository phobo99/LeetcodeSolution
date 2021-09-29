package kiemtragiuaki;

public class _125_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]+", "");

        String reverseStr = "";
        for (int i = s.length()-1; i >= 0; --i) {
            reverseStr = reverseStr + s.charAt(i);
        }
        if (s.equals(reverseStr)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
