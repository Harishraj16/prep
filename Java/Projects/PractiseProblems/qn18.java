import java.util.Arrays;
import java.util.Scanner;

//18.Given an integer num, return three consecutive integers (as a sorted array) that sum
//to num. If num cannot be expressed as the sum of three consecutive integers, return an
//empty array.
//Constraints:
//        0 &lt;= num &lt;= 1015
//Testcase 1:
//Input: num = 33
//Output: [10,11,12]
//Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
//        10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].
//Test Case 2:
//Input: num = 4
//Output: []
//Explanation: There is no way to express 4 as the sum of 3 consecutive integers.
public class qn18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        System.out.println(Arrays.toString(consecutiveSum(inp)));
    }

    static int[] consecutiveSum(int num) {
        for (int j = num / 2; j > 0; j--) {
            if (((3 * j) + 3) == num) {
                return new int[]{j, j + 1, j + 2};
            }
        }
        return new int[0];
    }
}
