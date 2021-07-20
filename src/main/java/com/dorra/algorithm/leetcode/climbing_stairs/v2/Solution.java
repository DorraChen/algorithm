package com.dorra.algorithm.leetcode.climbing_stairs.v2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dorra
 * @date 2021/6/28 17:39
 * @description LeetCode 70: https://leetcode-cn.com/problems/climbing-stairs/
 */
public class Solution {
    /**
     * 记录每层种类数
     */
    private static Map<String, Integer> stairsMap = new HashMap<>();
    /**
     * climbStairs
     *
     * @param n
     */
    public static int climbStairs(int n) {
        if (n < 1) {
            throw new RuntimeException("Please make sure that 1 <= n <= 45 ");
        }
        if (n == 1 || n == 2) {
            stairsMap.put(String.valueOf(n), n);
            return stairsMap.get(String.valueOf(n));
        }
        if (stairsMap.get(String.valueOf(n)) != null) {
            return stairsMap.get(String.valueOf(n));
        }
        int ret = climbStairs(n - 1) + climbStairs(n - 2);
        stairsMap.put(String.valueOf(n), ret);
        return ret;
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(climbStairs(45));
        System.out.println("-- It takes " + (System.currentTimeMillis() - time) + " ms !");
    }
}
