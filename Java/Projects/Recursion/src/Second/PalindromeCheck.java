package Second;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str = "Madam";
		if(ispalindrome(str,0))System.out.println("Palindrome!");
		else System.out.println("Not a Palindrome!");
	}

	private static boolean ispalindrome(String str,int i) {
		if(i>=str.length()/2) return true;
		if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
		return ispalindrome(str,i+1);
	}

}
