package com.arsatapathy.linkedList;

import com.arsatapathy.linkedLists.MyLinkedList;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    MyLinkedList list = new MyLinkedList();

    @Test
    public void test_01() {
        System.out.println(list.addNode(4));
        System.out.println(list.addNode(5));
        System.out.println(list.addNode(6));

        System.out.println(list.getHead());
        System.out.println(list.getLength());

        System.out.println(list.reverse());

        list.print(list.getHead());

        System.out.println();

        list.reverse(list.getHead(), null);

        System.out.println(
                list.getHead()
        );
    }
}
