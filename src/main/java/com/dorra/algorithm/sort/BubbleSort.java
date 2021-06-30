package com.dorra.algorithm.sort;

import java.util.Arrays;

/**
 * @author Dorra
 * @date 2021/5/29 17:02
 * @description 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] bubbleSortArray = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
//        int[] bubbleSortArray = {3, 5, 4, 1, 2, 6};
        System.out.println("------------冒泡排序------------");
        bubbleSort(bubbleSortArray);
    }

    /**
     * 冒泡排序
     *
     * @param sourceArray 数组
     */
    public static void bubbleSort(int[] sourceArray) {
        if (sourceArray.length <= 1) {
            return;
        }
        System.out.println("冒泡排序初始: " + Arrays.toString(sourceArray));
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 1; i < arr.length; i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    flag = false;
                    System.out.println("                        " + Arrays.toString(arr));

                }
            }
            System.out.println("第 " + i + " 次排序: " + Arrays.toString(arr));
            if (flag) {
                break;
            }
        }
    }
}
