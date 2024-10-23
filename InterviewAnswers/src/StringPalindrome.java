import java.util.Arrays;
public class StringPalindrome {
    public static void main(String[] args) {
        String s = "ab_a";
        s = s.toLowerCase();
        String a = s.replaceAll("[\\W_]", "");
        System.out.println(a);
        char[] b = a.toCharArray();
        char[] c = new char[b.length];
        int count = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            c[count] = b[i];
            count++;
        }
        String newStr = String.valueOf(c);
        System.out.println(a);
        System.out.println(newStr);
    }
}
