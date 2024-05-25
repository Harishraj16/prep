import java.util.*;
public class alternateSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<=j) {
            if(i==j) System.out.print(arr[i++] + " ");
            else{
                System.out.print(arr[j--] + " ");
                System.out.print(arr[i++] + " ");
            }
        }
    }
}
