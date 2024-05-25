import java.util.Arrays;

public class qn22 {
    public static void main(String[] args) {
        String[] inpArr = {"flower","fl","flow"};
        Arrays.sort(inpArr);
        String w1= inpArr[0];
        String w2= inpArr[inpArr.length - 1];

        String prefix = "";
        int len = w1.length();
        for(int i= 0; i< len; i++) {
            prefix = w1.substring(0, len - i);
            if(w2.startsWith(prefix)) continue;
            else break;
        }

        prefix = prefix.substring(0, prefix.length()-1);
        System.out.println(prefix);
    }
}
