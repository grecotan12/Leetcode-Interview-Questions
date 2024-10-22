import java.util.Arrays;
public class RemoveDublicateSortedArray {
    public static void main(String[] args) {
        //int[] arr = {0,0,1,1,1,1,2,3,3};

        // MY WORK
        // int iterations = arr.length - 2;
        // for (int i = 1; i <= iterations; i++) {
        //     System.out.println("Three numbers to compares are");
        //     System.out.println((i - 1) + " : " + i + " : " + (i + 1));
        //     if (arr[i-1] == arr[i] && arr[i-1] == arr[i+1] && arr[i] == arr[i+1]) {
        //         // IF FOUND ELEMENT SHIFT TO LEFT TO REMOVE ELEMENT
        //         int count = i - 1;
        //         for (int j = i; j < arr.length; j++) {
        //             arr[count] = arr[j];
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

    }

    // SOLUTION
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j-2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
