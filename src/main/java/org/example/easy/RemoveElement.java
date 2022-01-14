package org.example.easy;

/**
 * 链接：https://leetcode-cn.com/problems/remove-element/
 *
 * @author di_deng@droidhang.com
 */
public class RemoveElement {

    /**
     * 双指针
     * 覆盖数组之前的数据，常用nums[tail++] = nums[i]
     */
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int tail = 0;
        for (int i = 0; i < length; i++) {
           if (nums[i] != val) {
               nums[tail++] = nums[i];
           }
        }
        return tail;
    }

}
