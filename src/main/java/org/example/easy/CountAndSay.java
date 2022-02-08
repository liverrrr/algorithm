package org.example.easy;

/**
 * 链接: https://leetcode-cn.com/problems/count-and-say/
 * @author di_deng@droidhang.com
 */
public class CountAndSay {

    /**
     *  题意是数和说，根据如下序列 1, 11, 21, 1211, 111221, ...，求第 n 个数，
     *  规则很简单，就是数就是数这个数数字有几个，
     *  所以 1 就是 1 个 1：11，11 就是有 2 个 1：21，21 就是 1 个 2、1 个 1：1211，可想而知后面就是 111221，
     *  思路的话就是按这个逻辑模拟出来即可
     */
    public String countAndSay(int n) {
        String str = "1";
        while (--n > 0) {
            int times = 1;
            StringBuilder builder = new StringBuilder();
            char[] chars = str.toCharArray();
            for (int j = 1; j < chars.length; j++) {
                if (chars[j - 1] == chars[j]) {
                    times++;
                } else {
                    builder.append(times).append(chars[j - 1]);
                    times = 1;
                }
            }
            str = builder.append(times).append(chars[chars.length - 1]).toString();
        }

        return str;
    }

}
