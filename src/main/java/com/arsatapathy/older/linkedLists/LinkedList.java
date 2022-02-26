package com.arsatapathy.older.linkedLists;

import java.util.Comparator;

public class LinkedList<T> implements Comparator<Node<T>> {

    private Node<T> head = null;

    public LinkedList<T> add(T item) {

        Node<T> newNode = new Node<T>(item, null);

        // Empty List
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;

            while (temp.getNext() != null)
                temp = temp.getNext();

            temp.setNext(newNode);
        }

        return this;
    }

    public void addAfter(T refItem, T nextItem) {

        Node<T> newNode = new Node<T>(nextItem, null);

        // Empty List
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;

            while (temp.getNext() != null) {
                if (temp.getData() == refItem) {
                    break;
                }
                temp = temp.getNext();
            }

            newNode.setNext(temp.getNext());
            temp.setNext(newNode);

        }
    }

    public void remove(T item) {


        if (head != null) {
            Node<T> temp = head;
            Node<T> node = null;
            Node<T> prev = temp;

            while (temp != null) {
                if (temp.getData() == item) {
                    node = temp;
                    break;
                }
                prev = temp;
                temp = temp.getNext();
            }

            if (node != null) {
                Node<T> nextNode = node.getNext();

                // Only Node
                if (head == prev && nextNode == null) {
                    head = null;
                }
                // Head Node
                else if (head == prev) {
                    head = nextNode;
                }
                // Tail Node
                else prev.setNext(nextNode);
            } else {
                System.out.println("Item not found to delete.");
            }
        } else {
            System.out.println("Empty list..");
        }
    }


    public void print() {

        if (head != null) {
            Node<T> temp = head;

            while (temp != null) {
                System.out.print(temp.getData() + "->");
                temp = temp.getNext();
            }
            System.out.println("null");
        } else {
            System.out.println("Empty list..");
        }

    }

    public void reverse() {
        Node<T> temp;
        Node<T> next = head;
        Node<T> node = null;

        while (next != null) {
            temp = node;
            node = next;
            next = next.getNext();
            node.setNext(temp);
        }

        head = node;
    }

    public int count() {
        int count = 0;

        Node<T> temp = head;

        while (temp != null) {
            count ++;
            temp = temp.getNext();
        }

        return count;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }


    public LinkedList<T> addAccending(T item) {

        Node<T> newNode = new Node<T>(item, null);

        Node<T> temp = this.head;

        // Empty list or before head node
        if (temp == null || compare(temp, new Node<T>(item, null)) > 0) {
            setHead(newNode);
            newNode.setNext(temp);
        } else {
            while (temp != null) {
                // Middle of list or end of existing..
                if ((compare(temp, new Node<T>(item, null)) <= 0 && ((temp.getNext() == null) || compare(temp.getNext(), new Node<T>(item, null)) > 0))) {
                    newNode.setNext(temp.getNext());
                    temp.setNext(newNode);
                    break;
                }

                temp = temp.getNext();
            }

        }

        return this;
    }

    @Override
    public int compare(Node<T> o1, Node<T> o2) {
        return 0;
    }
}
