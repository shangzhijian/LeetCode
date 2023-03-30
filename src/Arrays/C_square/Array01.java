package Arrays.C_square;

import java.util.Arrays;
import java.util.Scanner;

/*
* 977. 有序数组的平方
*
* 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
*
* 输入：nums = [-4,-1,0,3,10]
输出：[0,1,9,16,100]
解释：平方后，数组变为 [16,1,0,9,100]
排序后，数组变为 [0,1,9,16,100]

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/squares-of-a-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */
public class Array01 {

    //双指针法
    //为什么用?
    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        //双指针
        int i = 0;
        int j = res.length - 1;
        //结果的指针，从大到小
        int k = res.length - 1;
        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j]){
                res[k--] = nums[i] * nums[i];
                i++;
            }else {
                res[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }

    public static void main (String[] args) {

        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
