import java.util.Scanner;

public class vowelsclear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String res = "";
        int n = str.length();
        int[] arr = new int[n];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            arr[i] = 1;
        }
        for(int i=0;i<n-1;i++){
            // if(arr[i]==0) res = res+str.charAt(i);
            // else{
            //     if(arr[i+1]==0) continue;
            //     else{
            //         res = res+str.charAt(i);
            //     }
            // }
            if(arr[i+1]==0) continue;
            else{
                res = res+str.charAt(i);
            }
        }
        System.out.println("Answer: "+res);
    }
}
