import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2,2,3};
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

    }
}
