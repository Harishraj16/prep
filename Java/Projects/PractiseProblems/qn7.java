import java.util.Scanner;

public class qn7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        if(divisorSum(num)>num){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
    static int divisorSum(int num){
        int sum=0;
        for(int i=1;i<Math.sqrt(num);i++){
            if(num%i==0) sum+=i;
        }
        sum+=num;
        return sum;
    }
}

