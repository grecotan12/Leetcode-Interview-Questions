import java.util.Arrays;

public class ShiftArrayRight {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        // SHIFT ELEMENT TO THE RIGHT?
        // 1 2 3 4 5 6 7
        // 0 1 2 3 4 5 6

        // 2 1 3 4 5 6 7
        // 1 0 2 3 4 5 6

        // 3 1 2 4 5 6 7
        // 2 0 1 3 4 5 6

        // 4 1 2 3 5 6 7
        // 3 0 1 2 3 4 5
        int k = 3;
        while (k > 0) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[count];
            nums[count] = temp;
        }
        System.out.println(Arrays.toString(nums));
        k--;
        }
    }
}
