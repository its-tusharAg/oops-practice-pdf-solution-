import java.util.*;
public class Question2 {

    public static void  strToChar(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        strToChar(str);
    }
}
