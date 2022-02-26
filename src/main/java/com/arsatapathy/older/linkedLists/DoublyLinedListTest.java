package com.arsatapathy.older.linkedLists;

public class DoublyLinedListTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dList = new DoublyLinkedList<Integer>();

        dList.add(1);
        dList.add(2);
        dList.add(3);

        dList.print();

        dList.printRevese();

        dList.delete();
        dList.delete();
        dList.delete();

    }
}
