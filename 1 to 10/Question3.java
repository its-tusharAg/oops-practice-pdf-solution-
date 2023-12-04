import java.util.*;

public class Question3 {

    public static boolean equalOrNot(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(equalOrNot(s1, s2));
    }
}
