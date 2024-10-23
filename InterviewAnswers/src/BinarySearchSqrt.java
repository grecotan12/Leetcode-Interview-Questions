public class BinarySearchSqrt {
    public static void main(String[] args) {
        int x = 16;
        int start = 0;
        int end = x;
        boolean isFound = false;
        while (start <= end) {
            int middle = (start + end) / 2;
            if ((middle * middle) < x) {
                start = middle + 1;
            }
            else if ((middle * middle) > x) {
                end = middle - 1;
            } else {
                System.out.println(middle);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println(end);
        }
    }
}
