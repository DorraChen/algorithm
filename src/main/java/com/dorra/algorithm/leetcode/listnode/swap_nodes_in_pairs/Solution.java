package com.dorra.algorithm.leetcode.listnode.swap_nodes_in_pairs;

import com.dorra.algorithm.leetcode.listnode.ListNode;

/**
 * @author dorra
 * @date 2021/10/21 19:14
 * @description LeetCode 24: https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummyHead.next;
    }
}
