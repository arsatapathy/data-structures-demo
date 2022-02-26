package com.arsatapathy.linkedLists;

public class LinkedListBasics<T> {
    private Node first;
    private Node last;
    private int size;

    private class Node {
        private T item;
        private Node nextNode;

        public Node(T item) {
            this.nextNode = null;
            this.item = item;
        }
    }

    public LinkedListBasics() {
        this.first = null;
        this.last = null;

        this.size = 0;
    }

    public void add(T item) {
        Node newNode = new Node(item);

        if (first == null) {
            first = newNode;
            last = first;
        } else {
            last.nextNode = newNode;
            last = newNode;
        }

        size ++;
    }

    public void insert(T item, int index) {
        if (index > size) throw new IllegalStateException("Invalid Index.");

        Node newNode = new Node(item);

        Node currentNode = first;

        for (int i=1; i < index && currentNode != null; i++)
            currentNode = currentNode.nextNode;

        newNode.nextNode = currentNode.nextNode;
        currentNode.nextNode = newNode;

        size ++;
    }

    public T remove() {
        Node removedNode;

        if (first == null) {
            return null;
        } else {
            removedNode = first;
            first = first.nextNode;
        }

        size --;

        return removedNode.item;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        StringBuilder values = new StringBuilder("LinkedList{");

        Node currentNode = first;

        while(currentNode != null) {
            values.append(currentNode.item);
            currentNode = currentNode.nextNode;

            if (currentNode != null) values.append(", ");
        }

        values.append("}");

        return  values.toString();
    }

}
