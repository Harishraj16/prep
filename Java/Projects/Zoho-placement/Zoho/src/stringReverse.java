public class stringReverse {
    public static void main(String[] args) {
        String str = "Hello!";
        str = reverse(str);
        System.out.println(str);
    }

    public static String reverse(String str) {
        String res = "";
        for(int i=str.length()-1;i>=0;i--){
            res = res + str.charAt(i);
        }
        return res;
    }
}
