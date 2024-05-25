import java.util.Scanner;

public class stringpalindrome {
    public static boolean ispalindrome(String s){
        int n = s.length();
        char[] ch = new char[n];
        int ind = 0;
        for(int i=n-1;i>=0;i++){
            ch[i] = s.charAt(ind++);
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String[] arr = str.split(" ");
        for(String st: arr){
            if(!ispalindrome(st)){
                System.out.println(st+" ");
            }
        }
    }
}
