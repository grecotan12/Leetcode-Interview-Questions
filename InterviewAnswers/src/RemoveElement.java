import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int val = 2;
        int count = 0;
        // PUT ELEMENT THAT IS NOT EQUAL TO VAL TO 
        // WHERE THE ELEMENT IS EQUAL TO value
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        // int count = 0;
        // System.out.println(nums[count]);
        // nums[count] = nums[2];
        // System.out.println(Arrays.toString(nums));
        // count++;
        // System.out.println(nums[count]);
        // nums[count] = nums[3];
        // System.out.println(Arrays.toString(nums));
    }
}
