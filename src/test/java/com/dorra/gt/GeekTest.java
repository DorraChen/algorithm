package com.dorra.gt;

import com.dorra.algorithm.gt.stack.ArrayStack;
import org.junit.Test;

/**
 * @author dorra
 * @date 2021/2/1 16:39
 * @description
 */
public class GeekTest {
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
}
