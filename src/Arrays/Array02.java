package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
        不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组
        元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素

        输入：nums = [3,2,2,3], val = 3
        输出：2, nums = [2,2]
        解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。
        例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/remove-element
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Array02 {

    public static int removeElement(int[] nums , int val) {

        int sum = 0;//记录个数

        //1. 从数组下标0开始，检查是否和val相等，
        for (int i = 0 ; i <= (nums.length - sum -1) ; i++) {
            //2. 相等令数组最后一个元素替换该下标位置对应元素，并从当前下标开始重新检查
            //3. 不相等下标继续往下，(i > nums.length - 1 - num) 结束;
            if (nums[i] == val) {

                nums[i] = nums[nums.length - sum -1];
                nums[nums.length - sum -1] = 0;
                sum++;
                i--;
            }
        }

        return (nums.length - sum);
    }

    public static void main(String[] args) {

        //int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int[] nums = new int[]{3,2,2,3,5};
        //[0,1,2,2,3,0,4,2]
        //2
        //[0,1,4,0,3]
        System.out.println("请输入移除元素");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        int len = removeElement(nums, val);
        System.out.println(len + ", " + Arrays.toString(nums));
    }
}
