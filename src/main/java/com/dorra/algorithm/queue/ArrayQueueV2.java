package com.dorra.algorithm.queue;

/**
 * @author dorra
 * @date 2021/03/24 23:02
 * @description
 */
public class ArrayQueueV2 {
    /**
     * 数组：items，数组大小：n
     */
    private String[] items;
    private int n = 0;
    /**
     * head表示队头下标，tail表示队尾下标
     */
    private int head = 0;
    private int tail = 0;

    /**
     * 申请一个大小为capacity的数组
     *
     * @param capacity
     */
    public ArrayQueueV2(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    /**
     * 入队操作，将item放入队尾
     *
     * @param item
     * @return
     */
    public boolean enqueue(String item) {
        // tail == n表示队列末尾没有空间了
        if (tail == n) {
            // tail ==n && head==0，表示整个队列都占满了
            if (head == 0) {
                return false;
            }
            // 数据搬移
            for (int i = head; i < tail; ++i) {
                items[i - head] = items[i];
            }
            // 搬移完之后重新更新head和tail
            tail -= head;
            head = 0;
        }

        items[tail] = item;
        ++tail;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public String dequeue() {
        // 如果head == tail 表示队列为空
        if (head == tail) {
            return null;
        }
        // 为了让其他语言的同学看的更加明确，把--操作放到单独一行来写了
        String ret = items[head];
        ++head;
        return ret;
    }
}
