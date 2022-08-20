package Arrays;

import java.util.Scanner;

/*给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

        请必须使用时间复杂度为 O(log n) 的算法。

 思考：有序，且不重复，所以二分法，时间效率更高；

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/search-insert-position
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Array01_1 {

    public static int function1 (int[] nums, int target) {
        for (int i = 0 ; i < nums.length ; i++) {
                if (target <= nums[i]) {
                        return i;
                    }
            }
            return nums.length;
        }

    public static int function2 (int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;

        while (left <= right) {
            if (target < nums[middle]) {
                right = middle - 1;
                middle = (left + right) / 2;
            }
            if (target > nums[middle]) {
                left = middle + 1;
                middle = (left + right) / 2;
            }
            if (target == nums[middle]) {
                return middle;
            }

        }
        /*
        分为四种情况考虑：
        1、target在区间left左边，此时[left,right]->[0,-1]
        2、target在数组中有相等的树枝，上面已经返回
        3、target在数组是要插入的情况，[left,right]->[left,(target), right]
        4、target在数组右边再靠右边，[left,right]->[left, right ,(target)]
        */
        return right + 1;
    }



    public static void main(String[] args) {

            int[] nums = new int[]{1, 3, 5, 6};
            System.out.println("请输入target值");
            Scanner sc= new Scanner(System.in);
            int target = sc.nextInt();

            int i1 = function1(nums, target);
            int i2 = function1(nums, target);
            System.out.println("i1 = " + i1 + ", i2 = " + i2);
        }
}
