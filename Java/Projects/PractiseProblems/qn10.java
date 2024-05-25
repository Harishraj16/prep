
import java.util.Scanner;

public class qn10 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(minimumSum(num));
    }

    static int minimumSum(int num){
        for(int i=(int)Math.sqrt(num);i>0;i--){
            int sum=0,count=0;
            while(sum<=num){
                if(sum==num)return count;
                sum+=Math.pow(i,2);
                count++;
            }
        }
        return num;
    }
}
