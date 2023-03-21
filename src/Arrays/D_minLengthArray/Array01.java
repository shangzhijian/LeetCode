package Arrays.D_minLengthArray;

import java.util.Scanner;

/*
209. 长度最小的子数组
给定一个含有 n 个正整数的数组和一个正整数 target 。

找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/minimum-size-subarray-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
13：26-13:33 7min
* */
public class Array01 {
    //暴力解法
    public static int minSubArrayLen(int target, int[] nums) {
        int length = 0;

        //双重for循环，暴力解法
        //起点
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int tempLen = 0;
            //根据起点，计算求和，找出最小数组
            for (int j = i; j < nums.length; j++) {
                sum = nums[j] + sum;
                tempLen++;
                if (sum >= target) {
                    //更新最小数组长度
                    //length == 0为初始值
                    if (length > tempLen || 0 == length) {
                        length = tempLen;
                    }
                    break;
                }
            }
        }

        return length;
    }

    //14:20-
    //窗口滑动思想
    public static int minSubArrayLen2(int target, int[] nums) {

        int sum = 0;
        int result = 0;
        int j = 0;//起始位置
        int temp = 0;

        //索引是终止位置
        for (int i = 0; i < nums.length; i++) {

            if (sum < target) {
                sum += nums[i];
            }

            while (sum >= target){
                //确定范围子数组
                temp = i - j + 1;
                if (temp < result || result == 0) {
                    result = temp;
                }
                //移动起始位置
                sum -= nums[j];
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("target = ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        //int[] nums = {1,1,1,1,1,1,1,1};//tar = 11
        int[] nums = {2,3,1,2,4,3};         //tar = 7
        System.out.println(minSubArrayLen(target, nums));
        System.out.println(minSubArrayLen2(target, nums));
    }

}
