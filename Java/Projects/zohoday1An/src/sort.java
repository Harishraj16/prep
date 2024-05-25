import java.util.Collections;
import java.util.*;

public class sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = in.nextInt();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) even.add(arr[i]);
            else odd.add(arr[i]);
        }
        Collections.sort(odd);
        Collections.sort(even);
        for(Integer num: odd) System.out.print(num+" ");
        for(Integer num: even) System.out.print(num+" ");
    }
}
