package Arrays;

/*给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。

        如果数组中不存在目标值 target，返回 [-1, -1]。

        你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

import java.util.Arrays;
import java.util.Scanner;

public class Array01_2 {

    public static int[] searchRange1(int[] nums, int target) {

        /*执行用时：1 ms, 在所有 Java 提交中击败了 9.31% 的用户
        内存消耗：44.4 MB, 在所有 Java 提交中击败了 80.46% 的用户*/

        int[] range = new int[2];
        int sum = 0;

        //找出所有和target相等的数组元素
        for (int i = 0; i < nums.length; i++) {

            if (target == nums[i]) {
                if (sum == 0) { //记录第一个target位置
                    sum++;  //记录有多少个target相等的数组元素
                    range[0] = i;
                } else {
                    sum++;
                    range[1] = i;
                }
            }
        }

        if (1 == sum) {     //数组仅有一个target相等的元素
            range[1] = range[0];
        }

        if (0 == sum) {     //数组中没有和target相等的元素
            //没有找到target时，
            range[0] = -1;
            range[1] = -1;
        }

        return range;
    }

    public static int[] searchRange2(int[] nums, int target) {



        //没有找到target时，
        nums[0] = -1;
        nums[1] = -1;
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{5,7,7,8,8,10};
        //int[] nums = new int[]{1,4};
        System.out.println("请输入target值");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int[] sr1 = searchRange1(nums, target);
        System.out.println("法一：" + Arrays.toString(sr1));

        int[] sr2 = searchRange2(nums, target);
        System.out.println("法二：" + Arrays.toString(sr2));
    }
}
