package com.dorra.algorithm.sort;

import java.util.Arrays;

/**
 * @author dorra
 * @date 2021/06/19 15:45
 * @description 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] mergeSortArray = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
//        int[] mergeSortArray = {3, 5, 4, 1, 2, 6};
        System.out.println("------------归并排序------------");
        System.out.println("归并排序初始: " + Arrays.toString(mergeSortArray));
        int[] sortResult = mergeSort(mergeSortArray);
        System.out.println("归并排序结果: " + Arrays.toString(sortResult));
    }

    private static int[] mergeSort(int[] sourceArray) {
        if (sourceArray.length <= 1) {
            return sourceArray;
        }
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.floor(arr.length / 2);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        System.out.println("left array: " + Arrays.toString(left));
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);
        System.out.println("right array:" + Arrays.toString(right));

        return merge(mergeSort(left), mergeSort(right));
    }

    protected static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }

        return result;
    }
}
