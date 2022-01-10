package org.example.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 链接：https://leetcode-cn.com/problems/roman-to-integer/
 *
 * @author di_deng@droidhang.com
 */
public class RomanToInteger {

    /**
     * 按照百度百科上的规则来做即可:
     * 1. 相同的数字连写，所表示的数等于这些数字相加得到的数，如 Ⅲ=3；
     * 2. 小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数，如 Ⅷ=8、Ⅻ=12；
     * 3. 小的数字（限于 Ⅰ、X 和 C）在大的数字的左边，所表示的数等于大数减小数得到的数，如 Ⅳ=4、Ⅸ=9。
     *
     */
    public int romanToInt(String s) {
        if (s == null || s.length() == 0){
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length();
        Integer sum = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }

        return sum;
    }

}
