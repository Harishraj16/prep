import java.util.Collections;
import java.util.*;

public class qn9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = in.nextInt();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0;i<n;i++){
            if((i+1)%2==0) even.add(arr[i]);
            else odd.add(arr[i]);
        }
        Collections.sort(odd);
        Collections.sort(even);
        for(int i=0;i<n/2;i++){
            System.out.print(odd.get(odd.size()-i-1) +" ");
            System.out.print(even.get(i)+" ");
        }
        if(n%2!=0) System.out.print(odd.get(0));
    }
}
