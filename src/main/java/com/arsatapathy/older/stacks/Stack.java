package com.arsatapathy.older.stacks;

public class Stack {

    class Node {
        Node prev = null;
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node bottom;
    private Node top;

    public Stack() {
        top = null;
        bottom = null;
    }

    public void push(int item) {

        Node newNode = new Node(item);

        if (bottom == null) {
            bottom = newNode;
            top = bottom;
        } else {
            newNode.prev = top;
            top.next = newNode;
            top = newNode;
        }

    }

    public void pop() {

        if (bottom == top) {
            top = bottom = null;
        }

        if (bottom != null) {
            top = top.prev;
        } else {
            System.out.println("Empty Stack");
        }

    }

    public void print() {
        if (bottom != null) {
            Node temp = top;

            System.out.print("Top->");
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.prev;
            }
            System.out.println("Bottom");
        }
    }
}
