package Arrays.B_removeElement;
/*  283. 移动零
    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    请注意 ，必须在不复制数组的情况下原地对数组进行操作。

    输入: nums = [0,1,0,3,12]
    输出: [1,3,12,0,0]

    https://leetcode.cn/problems/move-zeroes/
*/

import java.util.Arrays;

public class Array03 {

    public static void moveZeroes(int[] nums) {
        //双指针法判断
        int p1 = 0;
        int p2 = 0;
        int temp;

        while (p1 < nums.length) {//3.快指针遍历数组后结束
            //1.快指针为0时，后移
            if (0 == nums[p1]) p1++;
            else {
                //2.不为0时，慢指针所指元素和快指针所指元素交换，最后慢指针后移，快指针后移
                temp = nums[p2];
                nums[p2++] = nums[p1];
                nums[p1++] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
