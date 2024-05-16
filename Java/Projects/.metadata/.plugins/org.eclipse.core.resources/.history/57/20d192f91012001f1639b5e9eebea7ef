package first;

public class SumofNnumbers {

//	Parameterized way
//	public static void main(String[] args) {
//		int n = 5;
//		findsum(n,0);
//	}
//
//	private static void findsum(int n, int sum) {
//		if(n==0) {
//			System.out.println(sum);
//			return;
//		}
//		findsum(n-1,sum+n);
//	}
	
	public static void main(String[] args) {
		int n = 5;
		int sum = findsum(n);
		System.out.println(sum);
	}

	private static int findsum(int n) {
		if(n==1) return 1;
		return n+findsum(n-1);
	}

}
