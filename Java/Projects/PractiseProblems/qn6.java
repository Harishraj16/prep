import java.util.Scanner;

public class qn6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int rev = 0;
        while(temp>0){
            rev*=10;
            rev+=temp%10;
            temp/=10;
        }
        System.out.println(rev+num);
    }
}
