package com.dorra.algorithm.leetcode.listnode.reverse_linked_list.v1;

import com.dorra.algorithm.leetcode.listnode.ListNode;

/**
 * @author dorra
 * @date 2022/1/20 13:14
 * @description LeetCode 206: https://leetcode-cn.com/problems/reverse-linked-list/
 * 反转链表:方法一 迭代
 */
public class Solution {

    /**
     * 解析: 相当于把链表的指针反转过来
     * <p>
     * <img src="../Reverse Linked List v1.png" />
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        // 定义第一个指针
        ListNode prev = null;
        // 当前指针
        ListNode curr = head;
        // curr 为 null 说明到了最后一个元素
        while (curr != null) {
            // 为了防止链表断掉,所以要先记录curr的下一个指针
            ListNode next = curr.next;
            // curr的指针反转,指向prev
            curr.next = prev;
            // prev移动到curr位置
            prev = curr;
            // curr移动到next位置
            curr = next;
        }
        return prev;
    }
}
