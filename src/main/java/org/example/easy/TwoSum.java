package org.example.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 * @author di_deng@droidhang.com
 */
public class TwoSum {

    /**
     * 简单粗暴的两次遍历
     */
    public int[] solutionOne(int[] nums, int target) {
        if (nums.length == 0) {
            return null;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{i, j};
                }
            }
        }


        return null;
    }

    /**
     * 使用hashmap
     * key存储target - 当前值, value存储当前值的index
     */
    public int[] solutionTwo(int[] nums, int target) {
        if (nums.length == 0) {
            return null;
        }

        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer value = resultMap.get(nums[i]);
            if (value != null) {
                return new int[]{value, i};
            }
            resultMap.put(target - nums[i], i);
        }

        return null;
    }

}
