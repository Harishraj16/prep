import java.util.Scanner;

public class qn3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inp= scan.nextInt();
        while(((int)Math.log10(inp)+1)!=1){
            inp=breakSum(inp);
        }
        System.out.println(inp);
    }

    static int breakSum(int num){
        int tempSum=0;
        while(num!=0){
            int last=num%10;
            num/=10;
            tempSum+=last;
        }
        return  tempSum;
    }

}
