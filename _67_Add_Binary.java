public class _67_Add_Binary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int temp = 0;

        while (i >= 0 || j >= 0) {
            int sum = temp;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            sb.append(sum % 2);
            temp = sum / 2;
            i--;
            j--;
        }
        if (temp != 0) {
            sb.append(temp);

        }
        return sb.reverse().toString();
    }
}
