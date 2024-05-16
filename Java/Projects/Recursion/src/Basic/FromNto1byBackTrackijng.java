package Basic;

import java.util.Scanner;

public class FromNto1byBackTrackijng {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		print(1,n);
	}

	private static void print(int i,int n) {
		if(i>n) return;
		print(i+1,n);
		System.out.println(i);
	}

}
