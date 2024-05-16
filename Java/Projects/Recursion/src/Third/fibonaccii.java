package Third;

public class fibonaccii {

	public static void main(String[] args) {
		int n = 5;
		int res = fibo(n-1);
		System.out.print(res);
	}

	private static int fibo(int n) {
		if(n<=0) return 0;
		if(n==1) return 1;
		return fibo(n-1)+fibo(n-2);
	}

}
