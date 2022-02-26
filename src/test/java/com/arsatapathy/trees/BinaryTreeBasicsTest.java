package com.arsatapathy.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BinaryTreeBasicsTest {

    private BinaryTreeBasics<Integer> binaryTreeBasics;

    public void init() {
        binaryTreeBasics = new BinaryTreeBasics<>();

        binaryTreeBasics.add(5);

        binaryTreeBasics.add(6);
        binaryTreeBasics.add(7);
        binaryTreeBasics.add(8);

        binaryTreeBasics.add(1);
        binaryTreeBasics.add(2);
        binaryTreeBasics.add(3);
    }

    @Test
    public void testBianaryTreeBasics() {
        init();
        Assertions.assertEquals(binaryTreeBasics.size(), 7);
        Assertions.assertTrue(binaryTreeBasics.contains(8));
    }
}
