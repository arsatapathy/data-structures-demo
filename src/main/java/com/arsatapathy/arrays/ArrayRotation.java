package com.arsatapathy.arrays;

public class ArrayRotation {

    private static final int[] array = {1,2,3,4,5,6,7};
    private static final int d = 2;

    public static void main(String[] args) {
        for (int i = 0; i < d; i++)
            rotate();

        for (int j :
             array) {
            System.out.print(j + "");
        }
    }

    public static void rotate() {
        int temp = array[0];

        for (int i = 0; i < array.length -1; i++)
            array[i] = array[i + 1];


        array[array.length -1] = temp;
    }
}
