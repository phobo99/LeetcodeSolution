import java.util.Arrays;

public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] a) {
        int[] tongHang = new int[a.length];
        for (int i = 0; i < a.length; i++) {

            //batdau
            int tong = 0;
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
                tong += a[i][j];
            }
            //kethuc
            System.out.println();
            System.out.println("Tong: " + tong);
            tongHang[i] = tong;
        }

        System.out.println(Arrays.toString(tongHang));

        int max = tongHang[0];
        for (int i = 0; i < tongHang.length; i++) {
            if (tongHang[i] > max) {
                max = tongHang[i];
            }
            System.out.println(max);
        }


        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int[][] accounts2 = {{1,5}, {7,3}, {3,5}};
        int[][] accounts3 = {{2,8,7}, {7,1,3}, {1,9,5}};
        maximumWealth(accounts);
        maximumWealth(accounts2);
        maximumWealth(accounts3);

    }
}
