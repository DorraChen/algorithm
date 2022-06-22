package com.dorra.algorithm.leetcode.generate_parentheses.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dorra
 * @date 2022/06/22 21:19
 * @description 括号生成
 * LeetCode 22: https://leetcode.cn/problems/generate-parentheses/
 */
public class Solution {
    public static void main(String[] args) {
        List<String> generateParenthesis = generateParenthesis(5);
        System.out.println(generateParenthesis.size());
        for (String gen : generateParenthesis) {
            System.out.println(gen);
        }
    }

    /**
     * 暴力法
     *
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<String>();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    public static void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    public static boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') {
                ++balance;
            } else {
                --balance;
            }
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }
}
