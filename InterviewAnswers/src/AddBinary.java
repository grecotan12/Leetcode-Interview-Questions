import java.util.Arrays;
public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1101";

        String newstring="";
        int i=a.length()-1;
        int j=b.length()-1;
        char carry='0';
        while (i>=0 && j>=0){
            char first=a.charAt(i);
            char second=b.charAt(j);
            if (first=='0' && second=='0'){
                if (carry=='1'){
                    newstring='1'+newstring;
                    carry='0';
                }
                else{
                    newstring='0'+newstring;
                    carry='0';
                }
            }
            else if (first=='1' && second=='1'){
                if (carry=='0'){
                    newstring='0'+newstring;
                    carry='1';
                }
                else{
                    newstring='1'+newstring;
                    carry='1';
                }
            }
            else if (first=='1' && second=='0'){
                if(carry=='0'){
                    newstring='1'+newstring;
                }
                else{
                    newstring='0'+newstring;
                    carry='1';
                }
            }
            else if(first=='0' && second=='1'){
                if(carry=='0'){
                    newstring='1'+newstring;
                }
                else{
                    newstring='0'+newstring;
                    carry='1';
                }
            }
            i-=1;
            j-=1;
        }
        while (i>=0){
            char first=a.charAt(i);
            if (first=='1' && carry=='1'){
                newstring='0'+newstring;
                carry='1';
            }
            else if (first=='0' && carry=='0'){
                newstring='0'+newstring;
                carry='0';
            }
            else if (first=='1' && carry=='0'){
                newstring='1'+newstring;
            }
            else if (first=='0' && carry=='1'){
                newstring='1'+newstring;
                carry='0';
            }
            i-=1;
        }
        while (j>=0){
            char first=b.charAt(j);
            if (first=='1' && carry=='1'){
                newstring='0'+newstring;
                carry='1';
            }
            else if (first=='0' && carry=='0'){
                newstring='0'+newstring;
                carry='0';
            }
            else if (first=='1' && carry=='0'){
                newstring='1'+newstring;
            }
            else if (first=='0' && carry=='1'){
                newstring='1'+newstring;
                carry='0';
            }
            j-=1;
        }
        if (carry=='1'){
            newstring='1'+newstring;
            carry='0';
        }
        System.out.println(newstring);
                
    }
}
