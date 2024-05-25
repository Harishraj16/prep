import java.util.*;
public class diffrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i= 0; i< n; i++) {
            arr[i] = scanner.nextInt();
        }

		//Arrays.sort(arr);
        int minDif = 100000;
        for(int i= 0; i< n; i++) {
            for(int j= i + 1; j< n; j++) {
                int dif = arr[i] - arr[j];
                minDif = Math.min(minDif, dif);
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i= 0; i< n; i++) {
            for(int j= i + 1; j< n; j++) {
                int dif = arr[i] - arr[j];
                if(dif == minDif) {
                    res.add(arr[j]);
                    res.add(arr[i]);
                }
            }
        }

        Collections.sort(res);

        for(Integer num: res) {
            System.out.print(num+" ");
        }
    }
}
