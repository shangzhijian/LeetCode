package Arrays;

import java.util.Scanner;

/*给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。

二分法：前提条件，有序且不重复

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/binary-search
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Array01 {

    public static int binarySearch(int arr[], int target) {

        //1设置区间，区间方式为闭区间[]
        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;

        while (true) {

            //2判断中间位置是否大于目标值
            //2.1middle小于target，left = middle + 1
            if (arr[middle] < target) {
                left = middle + 1;
            } else if (arr[middle] == target) {
                return middle;
            } else {
                //2.2middle大于target, right = middle - 1
                right = middle - 1;
            }
            //变化middle值
            middle = (left + right) / 2;

            if (left > middle || right < middle) {
                return -1;
            }

        }
    }

    public static int binarySearch2(int arr[] ,int target) {

        //1.定义左右区间，
        int left = 0;
        int right = arr.length;
        int middle = (left + right) / 2;
        //2.判断特殊情况
        if (target < arr[0] || target > arr[right - 1]) return -1;

        while (left < right) {

            //middl < target ,left = middle + 1, [middle + 1 ,right )
            if (arr[middle] < target) {
                left = middle + 1;
            } else if (arr[middle] > target) {
                //middl > target ,right = middle, [left ,middle )
                right = middle;
            } else {
                //middle = target
                return middle;
            }

            middle = (left + right) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {

        int nums[] = new int[]{-1,0,3,5,9,12};
        System.out.println("请输入target");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(binarySearch(nums, target));
        System.out.println(binarySearch2(nums, target));
    }
}
