import java.util.*;
//pending
public class qn11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long num1 = in.nextLong();
        int n = (num1.toString()).length();
        int[] n1 = new int[n];
        int div =(int)Math.pow(10,(n-1));
        for(int i=0;i<n;i++){
            int t = (int)(num1/div);
            n1[i] = t%10;
            div/=10;
        }
        Long num2 = in.nextLong();
        n = (num2.toString()).length();
        int[] n2 = new int[n];
        div =(int)Math.pow(10,(n-1));
        for(int i=0;i<n;i++){
            int t = (int)(num1/div);
            n1[i] = t%10;
            div/=10;
        }
        List<Integer> res = new ArrayList<Integer>();
        n = Math.max(n1.length,n2.length);
        int i=n1.length-1,j=n2.length-1;
        int rem = 0;
        while(i>=0 && j>=0){
            int num = n1[i]+n2[j]+rem;
            if(num<10) res.add(num);
            else{
                res.add(num%10);
                rem = num/10;
            }
            i--;
            j--;
        }
        while(i-->=0) res.add(n1[i]);
        while(j-->=0) res.add(n2[j]);
        for(int k=res.size()-1;k>=0;k--){
            System.out.print(res.get(k)+" ");
        }
    }
}
