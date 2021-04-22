package com.dorra.algorithm.gt;

import com.dorra.algorithm.queue.ArrayQueue;
import com.dorra.algorithm.stack.ArrayStack;
import com.dorra.algorithm.trietree.Trie;
import org.junit.Test;

import java.util.Scanner;

/**
 * @author dorra
 * @date 2021/2/1 16:39
 * @description
 */
public class AlgorithmTest {

    @Test
    public void testArrayStack() {
        ArrayStack stack = new ArrayStack(3);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    @Test
    public void testArrayQueue() {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.enqueue("1");
        arrayQueue.enqueue("2");
        arrayQueue.enqueue("3");
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
    }

    @Test
    public void testTrieTree() {
        char[] chars = {'h', 'e', 'l','l','o'};
        char[] chars1 = {'h', 'e'};
        Trie trie = new Trie();
        trie.insert(chars);
        boolean flag = trie.find(chars);
        System.out.println(flag);
    }
}
