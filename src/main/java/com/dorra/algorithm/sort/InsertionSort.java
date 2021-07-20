package com.dorra.algorithm.sort;

import java.util.Arrays;

/**
 * @author dorra
 * @date 2021/5/30 15:12
 * @description 插入排序
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] insertionSortArray = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
//        int[] insertionSortArray = {4, 5, 6, 1, 3, 2};
        System.out.println("------------插入排序------------");
        insertionSort(insertionSortArray);
    }

    /**
     * 插入排序
     * <p>
     * 还可以写成 {@link #insertionSort1 insertionSort1}
     *
     * @param sourceArray 数组
     */
    public static void insertionSort(int[] sourceArray) {
        if (sourceArray.length <= 1) {
            return;
        }
        System.out.println("插入排序初始: " + Arrays.toString(sourceArray));
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {

            // 记录要插入的数据
            int tmp = arr[i];

            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
                System.out.println("                        " + Arrays.toString(arr));
            }

            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }

            System.out.println("第 " + i + " 次排序: " + Arrays.toString(arr));
        }
    }

    /**
     * 插入排序
     *
     * @param sourceArray 数组
     */
    public static void insertionSort1(int[] sourceArray) {
        if (sourceArray.length <= 1) {
            return;
        }
        System.out.println("插入排序初始: " + Arrays.toString(sourceArray));
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {
            // 记录要插入的数据
            int tmp = arr[i];
            int j = i;
            for (; j > 0; --j) {
                if (tmp < arr[j - 1]) {
                    // 数据移动
                    arr[j] = arr[j - 1];
                    System.out.println("                        " + Arrays.toString(arr));
                } else {
                    break;
                }
            }
            // 插入数据
            arr[j] = tmp;
            System.out.println("第 " + i + " 次排序: " + Arrays.toString(arr));
        }
    }
}
