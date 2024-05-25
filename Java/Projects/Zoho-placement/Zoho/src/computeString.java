public class computeString {
    public static void main(String[] args) {
        String str = "babca";
        int ans = compute(str);
        System.out.println("Ans: "+ans);
    }
    public static int compute(String str){
        int[] arr = new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        int res = 0;
        for(int i=0;i<26;i++){
            res += (i*(arr[i]));
        }
        return res;
    }
}
