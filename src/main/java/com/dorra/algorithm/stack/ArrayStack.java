package com.dorra.algorithm.stack;

/**
 * @author dorra
 * @date 2021/2/1 16:22
 * @description 基于数组实现的顺序栈
 */
public class ArrayStack {
    /**
     * 数组
     */
    private String[] items;
    /**
     * 栈中元素个数
     */
    private int count;
    /**
     * 栈的大小
     */
    private int n;

    /**
     * 初始化数组，申请一个大小为n的数组空间
     *
     * @param n
     */
    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    /**
     * 入栈操作
     * @param item
     * @return
     */
    public boolean push(String item) {
        // 数组空间不够了，直接返回false，入栈失败。
        if (count == n) {
            throw new ArrayIndexOutOfBoundsException(n +"push越界");
        }
        // 将item放到下标为count的位置，并且count加一
        items[count] = item;
        ++count;
        return true;
    }

    /**
     * 出栈操作
     * @return
     */
    public String pop() {
        // 栈为空，则直接返回null
        if (count == 0) {
            throw new ArrayIndexOutOfBoundsException(n +"pop越界");
        }
        // 返回下标为count-1的数组元素，并且栈中元素个数count减一
        String tmp = items[count - 1];
        --count;
        return tmp;
    }
}