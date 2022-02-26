package com.arsatapathy.older.linkedLists;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> iList = new LinkedList<Integer>();

        iList.add(2)
                .add(1)
                .add(3)
                .add(6)
                .add(4)
                .add(1)
                .add(5);

        iList.print();

        iList.reverse();
        iList.print();

        System.out.println("Count : " + iList.count());

        LinkedList<Student> sList = new LinkedList<Student>();

        sList.add(new Student(123, "ashish"))
                .add(new Student(456, "ranjan"))
                .add(new Student(789, "satapathy"));

        sList.print();

    }
}
