import java.util.Arrays;
public class ShiftArrayLeft {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            // 0 = 1
            // 1 = 2
            // 2 = 3
            // 3 = 4
            System.out.println(arr[count] + " = " + arr[i]);
            arr[count] = arr[i];
            count++;
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr, arr.length-1)));
    }
}
