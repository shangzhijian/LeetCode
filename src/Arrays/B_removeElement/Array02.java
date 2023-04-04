package Arrays.B_removeElement;

/*
* 26.删除排序数组中的重复项
* 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。

由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。

将最终结果插入 nums 的前 k 个位置后返回 k 。

不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
输入：nums = [1,1,2]
输出：2, nums = [1,2,_]
解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*
*

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */

public class Array02 {


    /*执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：42.8 MB, 在所有 Java 提交中击败了84.31%的用户*/
    public static int removeDuplicates(int[] nums) {

        int p1 = 0;
        int p2 = 0 ;

        //1 双指针法来确定重复数组元素，并进行移动
        while (p2 < nums.length) {//当快指针达到最后元素后结束移动

            if (nums[p1] == nums[p2]) {//2 快指针向后移动，和慢指针比较，相同时移动快指针，慢指针不变
                p2++;
            } else { //3 不相同时，移动慢指针，同时修改元素，将快指针指向元素移动到慢指针所指位置,然后快指针向后移动
               p1++;
               nums[p1] = nums[p2];
               p2++;
            }
        }
        //4 当快指针达到最后元素后结束移动，返回慢指针所指针元素小标，和之前的元素
        return p1+1;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int key = removeDuplicates(nums);
        System.out.println("去掉重复元素后有" + key + "个元素");
        for (int i = 0; i < key; i++) {
            System.out.println(nums[i]);
        }
    }
}
