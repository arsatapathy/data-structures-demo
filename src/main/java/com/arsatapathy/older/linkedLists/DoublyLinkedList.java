package com.arsatapathy.older.linkedLists;

public class DoublyLinkedList<T> {

    private DoublyNode<T> head = null;

    public void add(T item) {

        DoublyNode<T> newNode = new DoublyNode<T>(item, null, null);

        if (head == null) {
            head = newNode;
        } else {
            DoublyNode<T> temp = head;

            while (temp.getNext() != null)
                temp = temp.getNext();

            temp.setNext(newNode);
            newNode.setPrev(temp);
        }
    }

    public void delete() {

        if (head == null) {
            System.out.println("Empty list..");
        } else {
            DoublyNode<T> temp = head;

            while (temp.getNext() != null)
                temp = temp.getNext();

            if (temp.getPrev() == null) {
                head = null;
                System.out.println("Empty list..");
            } else {
                temp.getPrev().setNext(null);
            }
        }
    }

    public void print() {

        if (head != null) {
            DoublyNode<T> temp = head;

            while (temp != null) {
                System.out.print(temp.getData() + "->");
                temp = temp.getNext();
            }
            System.out.println("null");
        } else {
            System.out.println("Empty list..");
        }
    }

    public void printRevese () {

        if (head != null) {
            DoublyNode<T> temp = head;

            while (temp.getNext() != null)
                temp = temp.getNext();

            while (temp != null) {
                System.out.print(temp.getData() + "->");
                temp = temp.getPrev();
            }
            System.out.println("null");

        } else {
            System.out.println("Empty list...");
        }
    }
}
