import java.util.Arrays;

public class _1480_Running_Sum_of_1d_Array {
    public static int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums1)));
    }
}
