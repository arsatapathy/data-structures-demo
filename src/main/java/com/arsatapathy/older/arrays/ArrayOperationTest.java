package com.arsatapathy.older.arrays;

public class ArrayOperationTest {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{1,2,3,4,5};

        ArrayOperation<Integer> array = new ArrayOperation<>(intArray);

        System.out.println("Actual ");
        array.print();

        System.out.println("Insert 6 at end");
        array.insert(6).print();

        System.out.println("Delete from end");
        array.delete().print();

        System.out.println("Insert at 6 at 4");
        array.insert(6, 4).print();

        System.out.println("Insert at 4 at 4");
        array.insert(4, 4).print();

        System.out.println("Delete from 2");
        array.delete(2).print();

        System.out.println("Reverse");
        array.reverse().print();
    }
}
