import java.util.*;

public class qn5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        char check = scanner.next().charAt(0);

        int count= 0;
        for(int i= 0; i< inp.length(); i++) {
            if(inp.charAt(i) == check) count++;
        }

        System.out.println("Number of occurrences of "+check+" in the string: "+count);


    }
}