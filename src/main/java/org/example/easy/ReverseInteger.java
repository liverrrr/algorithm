package org.example.easy;

/**
 * 链接：https://leetcode-cn.com/problems/reverse-integer/
 *
 * @author di_deng@droidhang.com
 */
public class ReverseInteger {

    /**
     * 例如：
     * 123 => 321
     * 第一次循环：0*10 + 123%10 = 3
     * 第二次循环：3*10 + 12%10 = 32
     * 第三次循环：32*10 + 1%10 = 321
     */
    public int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10) {
            res = res * 10 + x % 10;
        }
        return res >= Integer.MAX_VALUE || res <= Integer.MIN_VALUE ? 0 : (int) res;
    }

}
