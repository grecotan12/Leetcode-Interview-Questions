import java.util.Arrays;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
        // SOLUTION
        int pointerA = 0;
        int pointerB = 0;
        while (pointerA < s.length() && pointerB < t.length()) {
            if (s.charAt(pointerA) == t.charAt(pointerB)) {
                pointerA++;
            }
            pointerB++;
        }


        
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();
        // char[] res = new char[a.length];

        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));

        // for (int i = 0; i < a.length; i++) {
        //     for (int j = i; j < b.length; j++) {
        //         System.out.println(a[i] + " : " + b[j]);
        //         if (a[i] == b[j]) {
        //             res[i] = a[i];
        //             break;
        //         } 
        //     }
        // }
        // String finalStr = new String(res);
        // System.out.println(finalStr);
        // System.out.println(finalStr.equals(s));
        // System.out.println(a.length);
        // System.out.println(res.length);
    }
}
