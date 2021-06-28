package com.dorra.algorithm.leetcode.climbing_stairs.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author clz
 * @date 2021/6/28 17:39
 * @description LeetCode 70: https://leetcode-cn.com/problems/climbing-stairs/
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 *
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 */
public class Solution {
    /**
     * 记录每层种类数
     */
    private static int[] stairs = new int[1000];
    /**
     * 解析:
     * - 1级台阶: 1种 (爬1阶)
     * - 2级台阶: 2种 (爬1阶 或者 爬2阶)
     * - 3级台阶: 3种 (2级台阶的基础上爬1阶 或者 1级台阶的基础上爬2阶)
     * - 4级台阶: 5种 (3级台阶的基础上爬1阶 或者 2级台阶的基础上爬2阶)
     * - n级台阶: ?种 (n-1级台阶的基础上爬1阶 或者 n-2级台阶的基础上爬2阶)
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
