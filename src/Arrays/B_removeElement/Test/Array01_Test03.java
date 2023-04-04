package Arrays.B_removeElement.Test;

import java.util.Arrays;
import java.util.Scanner;

/*
27. 移除元素
给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
        不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组
        元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素

        输入：nums = [3,2,2,3], val = 3
        输出：2, nums = [2,2]
        解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。
        例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/remove-element
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Array01_Test03 {

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        for (;right < nums.length ; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return left;
    }

    public static void main(String[] args) {
        System.out.println("val = ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        //int[] nums = new int[]{3,2,2,3};

        System.out.println(removeElement(nums ,val));

    }
}
