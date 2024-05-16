package Fourth;
import java.util.*;
public class Subsequence {

	public static void main(String[] args) {
		int[] arr = {3,2,1};
		ArrayList<Integer> ls = new ArrayList<>();
		print(0,ls,arr,arr.length);
	}

	private static void print(int i, ArrayList<Integer> ls, int[] arr, int n) {
		if(i==n) {
			if(ls.size() == 0) {
				System.out.println("{}");
			}
			else {
				for(Integer val: ls) {
					System.out.print(val+" ");
				}
			}
			System.out.println();
			return;
		}
		ls.add(arr[i]);
		print(i+1,ls,arr,n);
		ls.remove(ls.size()-1);
		print(i+1,ls,arr,n);
	}

}
