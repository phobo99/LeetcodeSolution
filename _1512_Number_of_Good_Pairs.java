public class _1512_Number_of_Good_Pairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i ; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] i = {1, 2, 3, 1, 1, 3};
        int[] i2 = {1, 1, 1, 1};
        int[] i3 = {1,2,3};
        System.out.println(numIdenticalPairs(i));
        System.out.println(numIdenticalPairs(i2));
        System.out.println(numIdenticalPairs(i3));

    }
}
