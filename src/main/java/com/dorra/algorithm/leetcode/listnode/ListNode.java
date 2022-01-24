package com.dorra.algorithm.leetcode.listnode;

/**
 * @author dorra
 * @date 2022/1/19 17:41
 * @description Definition for singly-linked list.
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
