package com.dorra.algorithm.gt;

import com.dorra.algorithm.queue.ArrayQueueV1;
import com.dorra.algorithm.queue.ArrayQueueV2;
import com.dorra.algorithm.stack.ArrayStack;
import com.dorra.algorithm.trietree.Trie;
import org.junit.Test;

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
    public void testArrayQueueV1() {
        ArrayQueueV1 arrayQueue = new ArrayQueueV1(2);
        arrayQueue.enqueue("1");
        arrayQueue.enqueue("2");
        arrayQueue.enqueue("3");
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
    }

    @Test
    public void testArrayQueueV2() {
        ArrayQueueV2 arrayQueue = new ArrayQueueV2(2);
        arrayQueue.enqueue("1");
        arrayQueue.enqueue("2");
        arrayQueue.enqueue("3");
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
    }

    @Test
    public void testTrieTree() {
        char[] text = {'h', 'e', 'l','l','o'};
        char[] pattern = {'h', 'e'};
        char[] pattern1 = {'h', 'a'};
        Trie trie = new Trie();
        trie.insert(text);
        System.out.println(trie.find(text));
        System.out.println(trie.startWith(pattern));
        System.out.println(trie.find(pattern1));
    }
}
