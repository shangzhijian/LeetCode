package Arrays.D_minLengthArray.Test;

import java.util.Arrays;
import java.util.Scanner;

/*
209. 长度最小的子数组
给定一个含有 n 个正整数的数组和一个正整数 target 。

找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/minimum-size-subarray-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
21:42-22：02
* */
public class Array01_Test01 {

    //滑动窗口
    public static int minSubArray(int[] nums, int target) {
        int i = 0;
        int sum = 0;//存放和
        int res = 0;
        //j代表终止位置
        for (int j = 0 ; j < nums.length; j++) {
            sum += nums[j];

            //当满足要求时，记录此时的长度
            //持续满足，持续记录
            while (sum >= target) {
                if (0 == res) {//第一次满足
                    res = j - i + 1;
                }
                if (res > j - i + 1) {
                    res = j - i + 1;
                }
                //满足后，改变sum和起始位置
                sum-=nums[i];
                i++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1,1,1,1,1,1,1,1};
        System.out.println("target=");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(minSubArray(nums, target));
    }
}
