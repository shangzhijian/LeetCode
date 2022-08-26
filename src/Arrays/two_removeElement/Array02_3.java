package Arrays.two_removeElement;

/*844. 比较含退格的字符串
        给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。

        注意：如果对空文本输入退格字符，文本继续为空。

        来源：力扣（LeetCode）
        链接：https://leetcode.cn/problems/backspace-string-compare
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

public class Array02_3 {
    public static boolean backspaceCompare(String s, String t) {

        int p1 = 0;
        int p2 = 0;
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        for ( ; p1 < chars.length ; p1++) {

            if (('#' == chars[p1]) && (0 == p1)) { //当第一个元素为“#”时，数组整体向前移动一位
                chars[p2] = chars[++p1];
            }
        }

    }
    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        backspaceCompare(s,t);
    }
}
