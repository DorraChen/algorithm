package com.dorra.algorithm.leetcode.climbing_stairs.v1;

/**
 * @author dorra
 * @date 2021/6/28 17:39
 * @description LeetCode 70: https://leetcode-cn.com/problems/climbing-stairs/
 */
public class Solution {
    /**
     * 记录每层种类数
     */
    private static int[] stairs = new int[1000];
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
            stairs[n - 1] = n;
            return stairs[n - 1];
        }
        if (stairs[n - 1] != 0) {
            return stairs[n - 1];
        }
        int ret = climbStairs(n - 1) + climbStairs(n - 2);
        stairs[n - 1] = ret;
        return ret;
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(climbStairs(45));
        System.out.println("-- It takes " + (System.currentTimeMillis() - time) + " ms !");
    }
}
