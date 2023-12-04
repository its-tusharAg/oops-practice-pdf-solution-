import java.util.*;

public class Question1 {
    public static int specialSqure(int arr[], int n){
        int sm =0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                sm += Math.pow(arr[i-1], 2);
            }
        }
        return sm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(specialSqure(arr, n));
    }
}
