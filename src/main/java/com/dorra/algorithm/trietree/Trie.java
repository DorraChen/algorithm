package com.dorra.algorithm.trietree;

/**
 * @author Dorra
 * @date 2021/4/22 15:43
 * @description
 */

public class Trie {
    /**
     * 存储无意义字符
     */
    private TrieNode root = new TrieNode('/');

    /**
     * 往Trie树中插入一个字符串
     *
     * @param text
     */
    public void insert(char[] text) {
        if (text == null || text.length < 1) {
            return;
        }
        TrieNode p = root;
        for (int i = 0; i < text.length; ++i) {
            int index = text[i] - 'a';
            if (p.children[index] == null) {
                TrieNode newNode = new TrieNode(text[i]);
                p.children[index] = newNode;
            }
            p = p.children[index];
        }
        p.isEnd = true;
    }

    /**
     * 在Trie树中查找一个字符串
     *
     * @param pattern
     * @return
     */
    public boolean find(char[] pattern) {
        TrieNode p = root;
        for (int i = 0; i < pattern.length; ++i) {
            int index = pattern[i] - 'a';
            if (p.children[index] == null) {
                // 不存在pattern
                return false;
            }
            p = p.children[index];
        }
        if (p.isEnd == false) {
            // 不能完全匹配,只是前缀
            return false;
        } else {
            // 找到pattern
            return true;
        }
    }

    /**
     * 前缀匹配
     *
     * @param prefix
     * @return
     */
    public boolean startWith(char[] prefix) {
        TrieNode p = root;
        for (int i = 0; i < prefix.length; ++i) {
            int index = prefix[i] - 'a';
            if (p.children[index] == null) {
                // 不存在pattern
                return false;
            }
            p = p.children[index];
        }
        return true;
    }

    public class TrieNode {
        /**
         * 节点值
         */
        public char data;
        /**
         * 字母映射表
         */
        public TrieNode[] children = new TrieNode[26];
        /**
         * 该结点是否是一个串的结束
         */
        public boolean isEnd = false;

        public TrieNode(char data) {
            this.data = data;
        }
    }
}