package com.dorra.algorithm.leetcode.listnode.reverse_linked_list.v2;

import com.dorra.algorithm.leetcode.listnode.ListNode;

/**
 * @author dorra
 * @date 2022/1/20 14:14
 * @description LeetCode 206: https://leetcode-cn.com/problems/reverse-linked-list/
 * 反转链表:方法二 递归
 */
public class Solution {

    /**
     * 可以把问题看成, 反转头节点以及头结点剩下的节点
     *
     * <img src="../Reverse Linked List v2.png" />
     *
     * <img src="../Reverse Linked List v2-2.png" />
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        // 递归终止条件
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
