import java.util.ArrayList;
import java.util.Scanner;

public class qn23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++) arr[i]=in.nextInt();
        printsubset(0,arr,new ArrayList<>());
    }

    public static void printsubset(int i, int[] arr, ArrayList<Integer> ds) {
        if(i==arr.length){
            //System.out.print("[");
            System.out.println(ds.toString());
            //System.out.println("[");
            return;
        }
        ds.add(arr[i]);
        printsubset(i+1,arr,ds);
        ds.remove(ds.size()-1);
        printsubset(i+1,arr,ds);
    }
}
