package main;

import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =  in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(isprime(arr[i])) System.out.print(arr[i]+" ");
        }
    }

    public static boolean isprime(int num){
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0 ) return false;
        }
        return true;
    }
}
