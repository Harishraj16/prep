public class minimumDuration {
	public static void main(String[] args) {
		int[] arr = {9,5,2,9,0,1};
		int minif = Integer.MAX_VALUE;
		int minis = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minif) {
				minis = minif;
				minif = arr[i];
			}
			else if(arr[i]>minif && arr[i]<minis) {
				minis = arr[i];
			}
		}
		System.out.println("Minimum Duration: "+ (minis-minif));
	}
}
