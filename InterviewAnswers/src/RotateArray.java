import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 9;
        int[] arr = new int[nums.length];
        k %= nums.length;
        System.out.println(k);
        // 2 3 4 5 6 0 1
        // ------------
        // 1 2 3 4 5 6 7
        /////////////////
        // 0 0 0 0 0 0 0
        // 6 7 1 2 3 4 5
        // 0 + 2 = 2 % 7 = 2
        // 1 + 2 = 3 % 7 = 3
        for (int i = 0; i < nums.length; i++) {
            System.out.println((i + k) % nums.length + " : " + i);
            arr[(i + k) % nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
