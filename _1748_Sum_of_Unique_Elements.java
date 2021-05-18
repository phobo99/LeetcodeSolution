public class _1748_Sum_of_Unique_Elements {
    public static int sumOfUnique(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count += 1;
                }
            }
            if (count == 1) {
                sum += nums[i];
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2};
        int[] nums2 = {1, 1, 1, 1};
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(sumOfUnique(nums1));
        System.out.println(sumOfUnique(nums2));
        System.out.println(sumOfUnique(nums3));
    }
}
