package com.dorra.algorithm.sort;

import java.util.Arrays;

/**
 * @author dorra
 * @date 2021/6/2 11:06
 * @description 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] selectionSortArray = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
//        int[] selectionSortArray = {4, 5, 6, 1, 3, 2};
        System.out.println("------------选择排序------------");
        selectionSort(selectionSortArray);
    }

    /**
     * 选择排序
     *
     * @param sourceArray 数组
     */
    public static void selectionSort(int[] sourceArray) {
        if (sourceArray.length <= 1) {
            return;
        }
        System.out.println("选择排序初始: " + Arrays.toString(sourceArray));
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        // 总共要经过 N-1 轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                    System.out.println("                        " + Arrays.toString(arr));
                }
            }

            // 将找到的最小值和i位置所在的值进行交换
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
            System.out.println("第 " + i + " 次排序: " + Arrays.toString(arr));
        }
    }
}
