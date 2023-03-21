package Arrays.A_binarySearch;

/*
367. 有效的完全平方数
给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。

完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。

不能使用任何内置的库函数，如  sqrt 。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/valid-perfect-square
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

import java.util.Scanner;

public class Array05 {

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
