package com.arsatapathy.older.queues;

public class Queue {

    class Node {
        Node prev = null;
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public Queue() {
       head = null;
       tail = null;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);

        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void dequeue() {
        if (head == tail) {
            head = tail = null;
        }

        if (head != null) {
            head = head.next;
        } else {
            System.out.println("Empty Queue");
        }
    }

    public void print() {
        if (head != null) {
            Node temp = head;

            System.out.print("Head<-");
            while (temp != tail.next) {
                System.out.print(temp.data + "<-");
                temp = temp.next;
            }
            System.out.println("Tail");
        }
    }
}
