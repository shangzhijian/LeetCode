package Arrays.one_binarySearch;

/*
  35.搜索插入位置
  给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
  请必须使用时间复杂度为 O(log n) 的算法。

 思考：有序，且不重复，所以二分法，时间效率更高；

示例：
输入: nums = [1,3,5,6], target = 7
输出: 4

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/search-insert-position
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

import java.util.Arrays;
import java.util.Scanner;

public  class Array02_Test01 {
    static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        //1 二分法判断（闭区间）
        while (true) {
            //2 三种情况处理middle
            if (nums[middle] < target) {
                left = middle + 1;
            }
            if (nums[middle] > target) {
                right = middle - 1;
            }
            if (nums[middle] == target)  {
                return middle;
            }
            //3 修改middle,边界处理
            middle = (left + right) / 2;
            //return middle + 1; //这里不正确
            if (middle < left ) return middle + 1;
            if (middle > right) return middle;
        }
        //return right + 1
    }

    public static void main(String[] args) {
        //1 获取target，准备数组
        int[] nums = {1, 3, 5, 6};
        System.out.println(Arrays.toString(nums));

        System.out.println("target=");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(searchInsert(nums,target));
    }
}
