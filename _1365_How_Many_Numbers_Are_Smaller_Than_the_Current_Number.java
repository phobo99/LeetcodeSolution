package kiemtragiuaki;

import java.util.Arrays;

public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int k = nums[i];
             result[i] = 0;
            for (int j = 0; j < n; j++) {
                if (k > nums[j]) {
                    result[i]++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
