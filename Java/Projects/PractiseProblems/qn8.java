import java.util.Scanner;

public class qn8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String target = scan.nextLine();
        System.out.println(compareString(input, target));
    }

    static int compareString(String input, String target) {
        for (int i = 0; i < input.length(); i++) {
            int flag=0;
            if (input.charAt(i) == target.charAt(0)) {
                for (int j = 0; j < target.length(); j++) {
                    if((i+j)>input.length()-1) return -1;
                    if (input.charAt(i + j) == target.charAt(j)) {
                        flag++;
                    }
                }
                if(flag==target.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
