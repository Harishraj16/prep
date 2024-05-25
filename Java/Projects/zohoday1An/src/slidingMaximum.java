import java.sql.SQLOutput;
import java.util.*;

public class slidingMaximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        //for(int i=0;i<n;i++) System.out.println(arr[i]+" ");
        int s = in.nextInt();
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<=(arr.length-s);i++){
            maxi = Integer.MIN_VALUE;
            for(int j=i;j<(i+s);j++){
                maxi = Math.max(arr[j],maxi);
            }
            System.out.print(maxi+" ");
        }
    }
}
