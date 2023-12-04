import java.util.*;

public class Question4 {
    public static String palind(String str){
        int n = str.length()-1;
        int i = 0;
        while (i<str.length()) {
            if(str.charAt(i) != str.charAt(n)){
                return "No";
            }
            i++; n--;
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(palind(str));
    }    
}
