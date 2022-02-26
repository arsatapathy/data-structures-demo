package com.arsatapathy.older.linkedLists;

public class IntegerLinkedList extends LinkedList<Integer> {

    @Override
    public IntegerLinkedList addAccending(Integer item) {

        IntegerNode newNode = new IntegerNode(item, null);

        IntegerNode head = (IntegerNode) getHead();
        IntegerNode temp = head;

        // Empty list or before head node
        if (head == null || temp.getData() > item) {
            setHead(newNode);
            newNode.setNext(temp);
        } else {
            while (temp != null) {
                // Middle of list or end of existing..
                if ((temp.getData() <= item && ((temp.getNext() == null) || temp.getNext().getData() > item))) {
                    newNode.setNext(temp.getNext());
                    temp.setNext(newNode);
                    break;
                }

                temp = (IntegerNode) temp.getNext();
            }

        }

        return this;
    }
}
