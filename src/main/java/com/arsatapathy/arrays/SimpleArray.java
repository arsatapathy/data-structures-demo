package com.arsatapathy.arrays;

public class SimpleArray {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};

        int i = 5;
        int j = 6;

        System.out.println(i + ", " + j);
        swap(i, j);
        System.out.println(i + ", " + j);

        print(array);
        swap(array, 0, 1);
        print(array);
    }

    public static void print(int[] array) {
        for (int e:
             array) {
            System.out.print(e + ", ");
        }

        System.out.println();
    }

    public static void swap(int[] array, int iTh, int jTh) {
        int temp = array[iTh];
        array[iTh] = array[jTh];
        array[jTh] = temp;

        print(array);
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;

        System.out.println(i + ", " + j);
    }
}
