package Arrays.E_SpiralMatrix;

import java.util.Arrays;
import java.util.Scanner;

/*螺旋矩阵：
* 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix
* 示例 1：
输入：n = 3
输出：[[1,2,3],[8,9,4],[7,6,5]]
示例 2：

输入：n = 1
输出：[[1]]
*
* n = 4
* [[1,2,3,4],[12,13,14,5],[11,16,15,6],[10,9,8,7]]
*
* 提示：
1 <= n <= 20
题目链接：https://leetcode.cn/problems/spiral-matrix-ii/
* */
public class Array01 {

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int k = 0;//圈数
        int startx = 0;
        int starty = 0;
        int offset = 1;//确定终点所用
        int count = 1;//内部填充元素
        //圈移动所用
        int i = 0;
        int j = 0;

        //循环不变量原则：前闭后开原则
        //确定走的圈数
        while(k < (n / 2)) {
            //上边
            for ( j = starty,i = startx ; j < n - offset; j++) {
                res[i][j] = count++;
            }
            //右边
            for ( i = startx; i < n -offset ; i++) {
                res[i][j] = count++;
            }
            //下边
            for (; j > starty ; j--) {
                res[i][j] = count++;
            }
            //左边
            for (; i > startx ; i--) {
                res[i][j] = count++;
            }

            //一圈走完后
            startx++;
            starty++;
            offset++;
            k++;
        }
        //n为奇数时，
        if (1 == n % 2) {
            res[startx][starty] = count;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] res = generateMatrix(n);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.println(res[i][j]);
            }
        }

    }
}
