public class PalindromeNumber {
    public static void main(String[] args) {
        long x = 121;
        long temp = x;
        long reverse = 0;
        while (x > 0) {
            reverse += x % 10;
            x /= 10;
            reverse *= 10;
        }
        reverse /= 10;
        System.out.println(reverse == temp ? true : false);
    }
}
