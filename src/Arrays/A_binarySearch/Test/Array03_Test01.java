/*
34. 在排序数组中查找元素的第一个和最后一个位置
给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。

        如果数组中不存在目标值 target，返回 [-1, -1]。

        你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
package Arrays.A_binarySearch.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Array03_Test01 {

    public static int[] searchRange(int[] nums, int target) {
        //1 准备边界和middle,和结果的数组
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        int[] res = {-1,-1};

        //特殊情况
        if (nums.length == 0) return res;

        //2 二分法找到相同的一个元素
        while (true) {
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                res[0] = middle;
                res[1] = middle;
                break;
            }
            //2.1 更新边界和middle
            middle = (left + right) / 2;
            if (middle < left || middle > right) {
                return res;
            }
        }
        //3 while判断范围，并返回最终结果
        while (middle - 1 >= 0) {//往左找
            if (nums[middle] == nums[middle -1]) {
                res[0] = middle - 1;
                middle = res[0];
            }else {
                break;
            }
        }

        while (middle + 1 < nums.length) {//往右找
            if (nums[middle] == nums[middle + 1]) {
                res[1] = middle + 1;
                middle = res[1];
            }else {
                break;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        //nums = [5,7,7,8,8,10], target = 8
        //输入：nums = [], target = 0
        //输出：[-1,-1]
        int[] nums = {5,7,7,8,8,10};
        System.out.println("target = ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
