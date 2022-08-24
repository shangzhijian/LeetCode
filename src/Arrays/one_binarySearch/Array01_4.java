package Arrays.one_binarySearch;

/*367. 有效的完全平方数
        给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。

        进阶：不要 使用任何内置的库函数，如  sqrt 。

         

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/valid-perfect-square
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

import java.util.Scanner;

public class Array01_4 {

    public static boolean mySqrt(int num) {

        long temp = num;

        while (temp * temp > num) {

            //1 找到平方后不大于num的数
            temp = temp / 2;
        }
        //2 慢慢增加到平方后大于num的数，看看有没有完全平方数
        while (temp * temp <= num) {

            if (temp * temp == num) {
                return true;
            } else {
                temp += 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("输入一个正整数！");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(mySqrt(num));
    }
}
