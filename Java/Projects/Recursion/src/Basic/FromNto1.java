package Basic;
import java.util.*;
public class FromNto1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		print(n);
	}

	private static void print(int n) {
		if(n==0)return;
		System.out.println(n);
		print(n-1);
	}

}
