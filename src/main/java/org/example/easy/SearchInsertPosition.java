package org.example.easy;

/**
 * 链接: https://leetcode-cn.com/problems/search-insert-position/
 * @author di_deng@droidhang.com
 */
public class SearchInsertPosition {

    /**
     * 二分查找法，因为查找到的条件是找到第一个等于或者大于 target 的元素的位置
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) >> 1;

        while (left <= right) {
            if (target <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (right + left) >> 1;
        }

        return left;
    }

}
