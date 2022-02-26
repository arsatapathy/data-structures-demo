package com.arsatapathy.stacks;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackBasicsTest {

    StackBasics<Integer> basicStacks = new StackBasics<>();;

    public void init() {
        basicStacks.push(1);
        basicStacks.push(2);
        basicStacks.push(3);
        basicStacks.push(4);
        basicStacks.push(5);
        basicStacks.push(6);
    }

    @Test
    public void testStack() {

        init();

        Assertions.assertEquals(6, basicStacks.getSize());

        Assertions.assertTrue(basicStacks.contains(3));
        Assertions.assertFalse(basicStacks.contains(7));

        Assertions.assertEquals(6, (int) basicStacks.pop());
        Assertions.assertEquals(5, (int) basicStacks.pop());
        Assertions.assertEquals(4, (int) basicStacks.pop());
        Assertions.assertEquals(3, (int) basicStacks.pop());
        Assertions.assertEquals(2, (int) basicStacks.pop());
        Assertions.assertEquals(1, (int) basicStacks.pop());

        Assertions.assertEquals(0, basicStacks.getSize());

        Assertions.assertNull(basicStacks.pop());
    }
}
