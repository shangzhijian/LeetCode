package Arrays.A_binarySearch.Test;
/*
  35.搜索插入位置
  给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
  如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

  请必须使用时间复杂度为 O(log n) 的算法。

 思考：有序，且不重复，所以二分法，时间效率更高；

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/search-insert-position
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

import java.util.Scanner;

public class Array02_Test03 {

    public static int searchInsert(int[] nums , int target) {

        //二分查找法
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {

            if ( nums[mid] > target) {
                right = mid - 1;

            }else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                return mid;
            }

            //更新mid
            mid = (left + right) / 2;
        }

        return right + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(searchInsert(nums, target));
    }
}
