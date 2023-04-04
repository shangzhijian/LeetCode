package Arrays.B_removeElement;

/*844. 比较含退格的字符串
        给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。

        注意：如果对空文本输入退格字符，文本继续为空。

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/backspace-string-compare
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

public class Array04 {
    public static boolean backspaceCompare(String s, String t) {

        int skips = 0;
        int skipt = 0;
        int i = s.length() - 1;
        int j = t.length() - 1;

        //1.大循环比较是否相同
        while (i >= 0 || j >= 0) {

            //2.内部循环判断字符串s
            while(i >= 0) {
                if (s.charAt(i) == '#') { //2.1 当字母为‘#’时，=> i-- , skip++,统计#的个数，之后前移做准备
                    i--;
                    skips++;
                } else if (skips > 0) {//2.2 根据统计#的个数，继续前移，实现#的退格功能
                    i--;
                    skips--;
                } else {    //2.2 当字母不为‘#’时 ，退出循环等待大循环比较
                    break;
                }

            }

            //3.内部循环判断字符串t
            while(j >= 0) {
                if (t.charAt(j) == '#') { //3.1 当字母为‘#’时，=> i-- , skip++,统计#的个数，之后前移做准备
                    j--;
                    skipt++;
                } else  if (skipt > 0){//3.2 根据统计#的个数，继续前移，实现#的退格功能
                    j--;
                    skipt--;
                } else {     //3.2 当字母不为‘#’时 ，退出循环等待大循环比较
                    break;
                }
            }

            //4.比较两个i，t指向的位置，字母是否相同
            //4.1 相同就i，t同时往前移一位
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) == t.charAt(j)) {
                    i--;
                    j--;
                } else {
                    //4.2 不同退出循环，返回false
                    return false;
                }
            } else if (i >= 0 || j >= 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        //String s = "ab#cd";
        // String t = "ad#c";

        String s = "bbbextm";
        String t = "bbb#extm";

        System.out.println(backspaceCompare(s,t));
    }
}
