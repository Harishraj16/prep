import java.util.Scanner;

public class qn20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.print("Enter elements: ");
        for(int i=0;i<3;i++) arr[i]=in.nextInt();
        if(arr[2]+arr[1] == arr[0]) System.out.println("True");
        else System.out.println("False");
    }
}
