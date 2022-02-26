package com.arsatapathy.older.linkedLists;

public class StudentLinkedList extends LinkedList<Student> {
    @Override
    public int compare(Node<Student> student1, Node<Student> student2) {
        return student1.getData().getRoll() - student2.getData().getRoll();
    }
}
