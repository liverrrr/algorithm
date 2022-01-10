package org.example.easy;

/**
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix/
 *
 * @author di_deng@droidhang.com
 */
public class LongestCommonPrefix {

    /**
     * 先找到数组中length最小的字符串，然后在 0...minLen的范围比较所有字符串
     * 如果比较到有不同的字符，那么直接返回当前索引长度的字符串即可，否则最后返回最短的字符串即可
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) minLen = Math.min(str.length(), minLen);
        for (int i = 0; i < minLen; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minLen);
    }

}
