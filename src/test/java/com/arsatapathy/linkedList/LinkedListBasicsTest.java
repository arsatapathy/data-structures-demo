package com.arsatapathy.linkedList;

import com.arsatapathy.linkedLists.LinkedListBasics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListBasicsTest {

    LinkedListBasics<Integer> linkedListBasics = new LinkedListBasics<>();

    public void init() {
        linkedListBasics.add(1);
        linkedListBasics.add(2);
        linkedListBasics.add(3);
        linkedListBasics.add(5);
        linkedListBasics.add(6);

        linkedListBasics.insert(4, 3);
    }

    @Test
    public void testLinkedList() {
        init();

        System.out.println(linkedListBasics.toString());

        Assertions.assertEquals(6, linkedListBasics.getSize());

        Assertions.assertEquals(1, (int) linkedListBasics.remove());
        Assertions.assertEquals(2, (int) linkedListBasics.remove());
        Assertions.assertEquals(3, (int) linkedListBasics.remove());
        Assertions.assertEquals(4, (int) linkedListBasics.remove());
        Assertions.assertEquals(5, (int) linkedListBasics.remove());
        Assertions.assertEquals(6, (int) linkedListBasics.remove());

        System.out.println(linkedListBasics.toString());

        Assertions.assertEquals(0, linkedListBasics.getSize());

        Assertions.assertNull(linkedListBasics.remove());


    }
}
