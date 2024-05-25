
import java.util.*;
public class sortletter {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArr = str.split(" ");
        TreeMap<Integer,String> mp = new TreeMap<>();
        for (int i = 0; i < strArr.length; i++) {
            int num = -1;
            String temp = "";
            for (int j = 0; j < strArr[i].length(); j++) {
                if (Character.isDigit(strArr[i].charAt(j))) {
                    num = strArr[i].charAt(j) - '0';
                } else {
                    temp += strArr[i].charAt(j);
                }
            }
            mp.put(num,temp);
        }
        for(int i=0;i<mp.size();i++){
            System.out.print(mp.get(i)+" ");
        }
    }
	
	

}
