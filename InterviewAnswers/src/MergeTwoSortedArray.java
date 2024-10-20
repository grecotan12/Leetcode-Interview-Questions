import java.util.Arrays;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{10,11,12,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
        System.out.println(Arrays.toString(nums1));
        // int pointer = m + n - 1;
        // int firstPointer = m - 1;
        // int secondPointer = n - 1;

        // System.out.println(Arrays.toString(nums1));
        // if (nums1[firstPointer] > nums2[secondPointer]) {
        //     nums1[pointer] = nums1[firstPointer];
        // }
        // System.out.println(Arrays.toString(nums1));

        // firstPointer--;
        // pointer--;


        // nums1[pointer] = nums1[firstPointer] < nums2[secondPointer] ? nums2[secondPointer] : nums1[firstPointer];
        // System.out.println(Arrays.toString(nums1));

        // pointer--;
        // secondPointer--;
        // nums1[pointer] = nums1[firstPointer] < nums2[secondPointer] ? nums2[secondPointer] : nums1[firstPointer];
        // System.out.println(Arrays.toString(nums1));

        // pointer--;
        // secondPointer--;
        // System.out.println(nums1[firstPointer] < nums2[secondPointer]);
        // nums1[pointer] = nums1[firstPointer];
        // System.out.println(Arrays.toString(nums1));
        // nums1[pointer-1] = nums2[secondPointer];
        // System.out.println(Arrays.toString(nums1));

        // pointer--;
        // firstPointer--;
        // secondPointer--;
        // System.out.println(pointer + " " + firstPointer + " " + secondPointer);

        int p = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
                p--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
