package main;

import java.util.*;

public class order {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        HashMap<Integer,String> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            String temp = "";
            while(i<str.length()){
                if(str.charAt(i)==' '){
                    num = 0;
                    temp="";
                    break;
                }
                if(str.charAt(i)>='0' && str.charAt(i)<='9') 
                temp = temp+str.charAt(i);
            }
        }
    }
}
