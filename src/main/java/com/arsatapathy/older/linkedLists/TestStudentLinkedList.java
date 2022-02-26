package com.arsatapathy.older.linkedLists;

public class TestStudentLinkedList {
    public static void main(String[] args) {
        StudentLinkedList sList = new StudentLinkedList();

        sList.addAccending(new Student(456, "ranjan"))
             .addAccending(new Student(123, "ashish"))
             .addAccending(new Student(789, "satapathy"));

        sList.print();
    }
}
