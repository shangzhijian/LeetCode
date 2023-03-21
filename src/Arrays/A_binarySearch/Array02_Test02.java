/*
  35.搜索插入位置
  给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

  请必须使用时间复杂度为 O(log n) 的算法。

 思考：有序，且不重复，所以二分法，时间效率更高；

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/search-insert-position
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

package Arrays.A_binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Array02_Test02 {

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        //1 二分法寻找
        while (true) {
            if (nums[middle] < target) {
                left = middle + 1;
            }else if (nums[middle] > target) {
                right = middle - 1;
            }else {
                return middle;
            }
            //2 更新middle，判断边界
            middle = (left + right) / 2;
            if (left > right) return right + 1;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(Arrays.toString(nums));

        System.out.println("target=");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(searchInsert(nums,target));
    }
}
