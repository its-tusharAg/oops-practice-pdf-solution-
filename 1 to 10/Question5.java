import java.util.*;

public class Question5 {
    public static int vov(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                return i;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
            String str = "Halwa";
            System.out.println(vov(str));
        }
}
