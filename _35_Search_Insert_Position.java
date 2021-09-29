package kiemtragiuaki;

public class _35_Search_Insert_Position {
    static int searchInsert(int[] a , int target)
    {
        int n = a.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] >= target)
                return i;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] s = {1, 3, 5, 6};
        int[] s1 = {1};
        System.out.println(searchInsert(s, 7));
        System.out.println(searchInsert(s1, 0));
    }
}
