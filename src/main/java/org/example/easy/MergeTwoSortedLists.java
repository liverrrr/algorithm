package org.example.easy;

/**
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 遍历两个链表
     */
    public ListNode mergeTwoListsOne(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode tmp = head;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                tmp.next = list2;
                list2 = list2.next;
            } else {
                tmp.next = list1;
                list1 = list1.next;
            }
            tmp = tmp.next;
        }

        tmp.next = list1 != null ? list1: list2;

        return head.next;

    }

    /**
     * 递归
     */
    public ListNode mergeTwoListsTwo(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoListsTwo(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsTwo(list1, list2.next);
            return list2;
        }
    }

}
