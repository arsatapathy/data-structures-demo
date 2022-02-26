package com.arsatapathy.arrays;

public class ArrayRotationByReversalAlgorithm {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,6,7,8,9};
       int d = 2;
       int n = array.length;

       print(array);

       /*
            array = {1,2,3,4,5,6,7,8,9}

            split the array into two parts

            A = array[0 .. d-1]
            B = array[d .. n-1]

            A = {1,2}
            B = {3,4,5,6,7,8,9}

            Ar = {2,1}
            Br = {9,8,7,6,5,4,3}

            ArBr = {2,1,9,8,7,6,5,4,3}
            (ArBr)r = {3,4,5,6,7,8,9,1,2}
        */
       reverse(array, 0, d-1);
       reverse(array, d, n-1);
       reverse(array, 0, n-1);

       print(array);
    }

    public static void print(int[] array) {
        for (int i:
             array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void reverse(int[] array, int start, int end){
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start ++;
            end --;
        }
    }
}
