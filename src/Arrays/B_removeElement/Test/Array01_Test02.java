package Arrays.B_removeElement.Test;

import java.util.Scanner;

/*27. 移除元素
给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

输入：nums = [0,1,2,2,3,0,4,2], val = 2
输出：5, nums = [0,1,4,0,3]
解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面的元素。


来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/remove-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
public class Array01_Test02 {

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
