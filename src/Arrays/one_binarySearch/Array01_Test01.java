package Arrays.one_binarySearch;

import java.util.Scanner;

/*给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。

二分法：前提条件，有序且不重复

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/binary-search
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Array01_Test01 {

    public static int search1() {
        //1.准备数组和目标
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println("请输入目标值：");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        //2.二分查找目标值，当left<=right时，循环
        int left = 0;
        int right = nums.length - 1; //长度一定要-1，长度和边界不一样
        int middle = (left + right) / 2;
        while (true) {

            //2-1 当中间值小于目标时，right = middle - 1
            if (nums[middle] > target) {
                right = middle - 1;
            }
            else if ((nums[middle] < target)) {  //2-2 当中间值大于目标时，left = middle + 1
                left = middle + 1;
            }
            else {  //2-3 相同时返回index
                return middle;
            }
            //改变left和right后，更改midle，同时判断越界问题
            middle = (left + right) / 2;
            if (middle < left || middle > right) return -1;
        }
    }

    public static int search2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println("target = ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        //2分法：前闭后开
        while (true) {
            if (nums[middle] < target) {
                right = middle;
            }
        }
    }

    //方法一：假设目标在闭区间内
    //[-1,0,3,5,9,12]
    public static void main(String[] args) {
        System.out.println(search1());
    }
}
