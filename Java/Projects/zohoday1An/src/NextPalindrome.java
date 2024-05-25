import java.util.Scanner;

public class NextPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        num+=1;
        while(!ispalindrome(num)){
            num+=1;
        }
        System.out.print(num);
    }

    private static boolean ispalindrome(int num) {
        int temp = num;
        int rev = 0;
        while(num>0){
            rev *=10;
            rev+=num%10;
            num/=10;
        }
        return temp==rev;
    }
}
