/*
69.x 的平方根
给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。

二分法：前提条件，有序且不重复

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/binary-search
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

package Arrays.one_binarySearch;

import java.util.Scanner;

public class Array01_Test03 {

    public static int search(int[] nums, int target) {
        //1 确定边界和中间值
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        //2 使用二分法
        while (true) {
            if (nums[middle] > target) {
                right = middle - 1;
            }else if (nums[middle] < target) {
                left = middle + 1;
            }else {
                return middle;
            }
            //3 更新middle和确定边界
            middle = (left + right) / 2;
            if (middle < left || middle > right) {
                return -1;
            }

        }
    }

    public  static void  main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println("target = ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(search(nums, target));
    }
}
