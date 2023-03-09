package Arrays.one_binarySearch;

import java.util.Scanner;

/*给你一个非负整数 x ，计算并返回 x 的 算术平方根 。

        由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。

        注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。


        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/sqrtx
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Array04 {

    public  static long  mySqrt(int x) {

        long temp = x;
        long left = temp;

        while(left * left > x) { //先找到距离算术平方根最近的值，比平方根小
            temp = temp / 2;
            left = temp;
            //System.out.println(left);
        }

        while (left * left <= x){   //每次一点点递增；算出的left比平方根大一点
            left += 1;
        }

        int l = (int)left;
        return (l - 1);
    }

    public static void main(String[] args) {

        System.out.println("请输入x值");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        System.out.println(mySqrt(key));

    }
}
