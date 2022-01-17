package org.example.easy;

/**
 * 链接: https://leetcode-cn.com/problems/implement-strstr/
 *
 * @author di_deng@droidhang.com
 */
public class ImplementStrstr {

    /**
     * 从主串中找到子串的索引，如果找不到则返回-1，当子串长度大于主串，直接返回-1，然后我们只需要遍历比较即可
     * 需要注意的是needle为空时，记得询问面试官返回什么
     */
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l2 == 0) {
            return 0;
        }

        if (l1 == 0 || l2 > l1) {
            return -1;
        }

        for (int i = 0; i < l1; i++) {
            if (i + l2 > l1) {
                return -1;
            }
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 1; ; j++) {
                    if (j == l2) {
                        return i;
                    }
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
            }
        }

        return -1;
    }

}
