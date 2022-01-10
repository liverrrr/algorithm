package org.example.easy;

/**
 * 链接：https://leetcode-cn.com/problems/diving-board-lcci/
 *
 * @author di_deng@droidhang.com
 */
public class DivingBoardLCCI {

    /**
     * 当 k == 0 时，返回 [] 即可；
     * 当 shorter == longer 时，返回 [k * shorter] 即可；
     * 当 shorter != longer 时，那么其实就是一个首项为 k * shorter，末项为 k * longer，公差为 longer - shorter 的等差数列么；
     */
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k <= 0) {
            return new int[0];
        }

        if (shorter == longer) {
            return new int[]{k * shorter};
        }

        // 假设m(0<=m<=k)块longer, (k - m) * shorter, 总长度: m * longer + (k - m) * shorter = k * shorter + m * (longer - shorter)
        int[] r = new int[k + 1];
        for (int m = 0; m < r.length; m++) {
            r[m] = k * shorter + m * (longer - shorter);
        }

        return r;
    }

}
