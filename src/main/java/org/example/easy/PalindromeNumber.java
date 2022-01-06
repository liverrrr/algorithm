package org.example.easy;

/**
 * 链接: https://leetcode-cn.com/problems/palindrome-number/
 *
 * @author di_deng@droidhang.com
 */
public class PalindromeNumber {

    /**
     * 直接算出反转后的值进行比较
     */
    public boolean isPalindromeOne(int x) {
        if (x < 0) {
            return false;
        }

        int ori = x;
        long res = 0;
        for (; x != 0; x /= 10) {
            res = res * 10 + x % 10;
        }

        return res <= Integer.MAX_VALUE && (int) res == ori;
    }

    /**
     * 不需要算出整个反转值，只要出现反转之后的值大于一直处以10的原值即可，但会出现10的倍数的数10010也会返回True
     */
    public boolean isPalindromeTwo(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int halfReverseX = 0;
        while (x > halfReverseX) {
            halfReverseX = halfReverseX * 10 + x % 10;
            x /= 10;
        }
        return halfReverseX == x || halfReverseX / 10 == x;
    }

}
