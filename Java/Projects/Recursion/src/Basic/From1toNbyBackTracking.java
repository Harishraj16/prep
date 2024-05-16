package Basic;
import java.util.*;
public class From1toNbyBackTracking {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		print(n);
	}

	private static void print(int n) {
		if(n==0) return;
		print(n-1);
		System.out.println(n);		
	}

}
