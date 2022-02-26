package com.arsatapathy.linkedLists;

public class MyLinkedList {
    private Node head;
    private int length;


    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public Node addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        length += 1;

        return head;
    }

    public Node reverse() {

        if (head != null) {
            Node current = head;
            Node prev = null;

            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;
        }

        return head;
    }

    public void print(Node head) {
        if (head == null) return;

        System.out.print(head.data + " ");
        print(head.next);
    }

    public void reverse(Node current, Node prev) {

        if (current == null) {
            head = prev;
        } else {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;

            reverse(current, prev);
        }

    }

    static class Node {
        private int data;
        private Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
           return  "{" +
                    "Node data=" + data + "," +
                    " next=" + next +
                    "}";
        }
    }

}