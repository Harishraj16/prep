import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class qn21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        System.out.print("Enter n:");
        int n = in.nextInt();
        System.out.print("Enter elements:");
        int[] num1 = new int[n];
        System.out.print("Odd Array: ");
        for(int i=0;i<n;i++){
            num1[i] = in.nextInt();
            if(num1[i]%2==0) even.add(num1[i]);
        }
        System.out.print("Enter n:");
        n = in.nextInt();
        int[] num2 = new int[n];
        System.out.print("Enter elements:");
        for(int i=0;i<n;i++){
            num2[i] = in.nextInt();
            if(num2[i]%2==0) even.add(num2[i]);
        }
        System.out.print("Odd Array: ");
        for (int val: num1) {
            if((val&1) == 1) System.out.print(val+" ");
        }
        System.out.println();
        Collections.sort(even);
        System.out.print("Even Array: ");
        for (Integer val: even) System.out.print(val+" ");
//        int i=0,j=0;
//        while(i<num1.length && j<num2.length){
//            if(num1[i]%2==0) System.out.print(num1[i]+" ");
//            if(num2[j]%2 == 0) System.out.print(num2[i]+" ");
//            i++;
//            j++;
//        }
    }
}


//
//Scanner in = new Scanner(System.in);
//ArrayList<Integer> odd = new ArrayList<>();
//ArrayList<Integer> even = new ArrayList<>();
//        System.out.print("Enter n:");
//int n = in.nextInt();
//        System.out.print("Enter elements:");
//int[] num1 = new int[n];
//        for(int i=0;i<n;i++){
//num1[i] = in.nextInt();
//            if(num1[i]%2==0) even.add(num1[i]);
//            else odd.add(num1[i]);
//        }
//                System.out.print("Enter n:");
//n = in.nextInt();
//int[] num2 = new int[n];
//        System.out.print("Enter elements:");
//        for(int i=0;i<n;i++){
//num2[i] = in.nextInt();
//            if(num2[i]%2==0) even.add(num2[i]);
//        }
//                System.out.print("Odd Array: ");
//        for (Integer val: odd) System.out.print(val+" ");
//        System.out.println();
//        System.out.print("Even Array: ");
//        for (Integer val: even) System.out.print(val+" ");
//
