import java.util.Scanner;

public class qn25 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String input= inp.next().strip();
        int start=input.length()/2;
        for(int i=start;i<input.length();i++){
            System.out.print(input.charAt(i));
        }
        for (int i=0;i<start;i++){
            System.out.print(input.charAt(i));
        }
    }
}
