package main;

import java.util.*;
class reverseWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strarr = str.split("\\.");
        printrec(strarr,1);
        System.out.println(strarr[0]);
    }
    public static void printrec(String[] arr,int i){
        if(i>=arr.length) return;
        printrec(arr,i+1);
        System.out.print(arr[i]+".");
    }
}