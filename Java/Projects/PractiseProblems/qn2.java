import java.util.*;

public class qn2 {
    public static int fib(int n) {
        if(n <= 1) return n;

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);

        int[] inp = {1, 10, 6, 8, 13, 21};

        int max = -1;
        for(int i= 0; i< inp.length; i++) {
            max = Math.max(max, inp[i]);
        }

//		System.out.println(max+" ");

        int num = 0;
        int fibo = arr.get(num);
        while(fibo <= max) {
            num++;
            if(arr.size()-1 < num) {
                arr.add(arr.get(arr.size() -1) + arr.get(arr.size() -1));
            }
            fibo = arr.get(num);
        }
        num++;

        HashSet<Integer> hs = new HashSet<Integer>();
//		System.out.println(num);
        for(int i= 0; i<= num + 1; i++) {
            int temp = fib(i);
//			System.out.println(temp);
            hs.add(temp);
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        for(Integer itr: inp) {
            if(hs.contains(itr)) res.add(itr);
        }

        for(Integer result: res) {
            System.out.print(result+" ");
        }

    }
}

