package com.dorra.algorithm.leetcode.listnode.reverse_linked_list.v1;

import com.dorra.algorithm.leetcode.listnode.ListNode;

/**
 * @author dorra
 * @date 2021/10/21 19:14
 * @description LeetCode 206: https://leetcode-cn.com/problems/reverse-linked-list/
 * 反转链表:方法一 迭代
 */
public class Solution {

    /**
     * 解析: 相当于把链表的指针反转过来
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        // 定义头指针
        ListNode prev = null;
        // 当前指针
        ListNode curr = head;
        // curr 为 null 说明到了最后一个元素
        while (curr != null) {
            // 为了防止指针断掉,所以要先记录curr的下一个指针
            ListNode next = curr.next;
            // curr下一个指针设置为prev指针
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
