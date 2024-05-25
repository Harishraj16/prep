import java.util.ArrayList;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        int n = scanner.nextInt();
        for(int i= 0; i< n; i++) {
            if(i == 0) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(1);
                arr.add(temp);
                continue;
            }
            else {
                ArrayList<Integer> temp = arr.get(i-1);
                ArrayList<Integer> res = new ArrayList<Integer>();

                int count = 1;
                int num = temp.get(0);
                for(int j= 1; j< temp.size(); j++) {
                    if(temp.get(j) == num) {
                        count++;
                    }
                    else {
                        res.add(count);
                        res.add(num);
                        num = temp.get(j);
                        count = 1;
                    }
                }
                res.add(count);
                res.add(num);

                arr.add(res);

            }
        }

        for(ArrayList<Integer> check: arr) {
//			System.out.println(check.toString());
            for(Integer num: check) {
                System.out.print(num+" ");
            }
            System.out.println();
        }



    }
}
