package com.dorra.algorithm.leetcode.check_if_matrix_is_x_matrix;

/**
 * @author dorra
 * @date 2023/01/31 22:54
 * @description LeetCode 2319: https://leetcode.cn/problems/check-if-matrix-is-x-matrix/
 */
public class Solution {
    /**
     * 如果一个正方形矩阵满足下述 全部 条件，则称之为一个 X 矩阵 ：
     * <p>
     * 矩阵对角线上的所有元素都 不是 0
     * 矩阵中所有其他元素都是 0
     * 给你一个大小为 n x n 的二维整数数组 grid ，表示一个正方形矩阵。如果 grid 是一个 X 矩阵 ，返回 true ；否则，返回 false 。
     * <p>
     * eg:
     * 输入：
     * grid =
     * [[2,0,0,1],
     * [0,3,1,0],
     * [0,5,2,0],
     * [4,0,0,2]]
     * 输出：true
     *
     * @param grid
     * @return
     */
    public static boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j || (i + j) == (n - 1)) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else if (grid[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 0, 0, 1},
                {0, 3, 1, 0},
                {0, 5, 2, 0},
                {4, 0, 0, 2}
        };
        System.out.println(checkXMatrix(grid));

        int[][] grid1 = {
                {5, 7, 0},
                {0, 3, 1},
                {0, 5, 0}
        };
        System.out.println(checkXMatrix(grid1));
    }
}