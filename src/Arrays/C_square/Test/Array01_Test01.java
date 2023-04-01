package Arrays.C_square.Test;

import java.util.Arrays;

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
/*
* 完成时间：17:50-18:02
* */
public class Array01_Test01 {

    public static int[] sortedSquares(int[] nums) {

        //双指针法，往中间移动，确定的是最大的，存入新数组
        int left = 0;
        int right = nums.length - 1;
        int len = nums.length;
        int[] res = new int[len];
        int k = len - 1;

        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                res[k--] = nums[left] * nums[left];
                left++;
            } else {
                res[k--] =  nums[right] * nums[right];
                right--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
