package Arrays.one_binarySearch;
/*
69.x 的平方根
给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。

二分法：前提条件，有序且不重复

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/binary-search
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

import java.util.Arrays;
import java.util.Scanner;

public class Array01_Test02 {
    //假设闭区间
    public static int search1() {
        //1 准备数组，和target
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(Arrays.toString(nums));
        System.out.println("请输入target:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        //2 二分法查找 假设闭区间
        //注意，区间，右边界移动时right = middle
        //左边界left = middle + 1
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        while (true) {
            //2-1 middle > target, right = middle
            if (nums[middle] > target) {
                right = middle;
            }
            //2-2 middle < target, left = middle + 1
            else if (nums[middle] < target) {
                left = middle + 1;
            }
            //2-3 middle = target, return middle
            else return middle;

            //2-4 更改middle，并进行越界判断
            middle = (left + right) / 2;
            if (middle < left || middle >= right) {
                return -1;
            }
        }
        //4 打印结果
    }

    //前闭后开区间
    public static int search2() {
        //1 创建测试案例
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println("target = ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        //2 开区间进行二分法查找
        while (true) {
            if (nums[middle] < target) {
                left = middle + 1;
            }
            if (nums[middle] > target) {
                right = middle;
            }
            if (nums[middle] == target) {
                return middle;
            }
            middle = (left + right) / 2;
            if (middle < left || middle > right) {
                return -1;
            }
        }
    }



    public static void main(String[] args) {
        System.out.println(search1());
        System.out.println(search2());
    }
}
