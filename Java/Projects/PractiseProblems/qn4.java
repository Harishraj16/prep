import java.util.*;

public class qn4 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama";
        str = str.toLowerCase();

        String inp = "";
        for(int i= 0; i< str.length(); i++) {
            char temp = str.charAt(i);
            if(temp >= 'a' && temp <= 'z') inp += temp;
        }


//		System.out.println(inp);

        StringBuilder sb = new StringBuilder();
        sb.append(inp);
        sb.reverse();
        String rev = sb.toString();

//		System.out.println(rev);

        if(inp.equals(rev)) {
            System.out.println("The string is a valid palindrome.");
        }
        else {
            System.out.println("The string is not a valid palindrome.");

        }


    }
}

