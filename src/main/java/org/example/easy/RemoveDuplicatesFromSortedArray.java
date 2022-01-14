package org.example.easy;

/**
 * 链接: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 *
 * @author di_deng@droidhang.com
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * 数组双指针
     * 如果前面和后面数不一样，就让tail++，而且将i所在的数往前移
     * 注意指针从1开始
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int tail = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[tail++] = nums[i];
            }
        }

        return tail;
    }

}
