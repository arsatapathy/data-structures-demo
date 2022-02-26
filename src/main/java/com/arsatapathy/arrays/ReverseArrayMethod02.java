package com.arsatapathy.arrays;

// Given an array {1, 2, 3, 4, 5} print its reverse {5, 4, 3, 2, 1}
// Recursive Method - Time Complexity O(n)
public class ReverseArrayMethod02 {


    public static void reverse(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, ++start, --end);
    }

    public static void print(int[] array) {
        for (int e:
             array) {
            System.out.print(e);
        }
        System.out.println();
    }


    public static void main(String[] args) {
       int[] array = {1, 2, 3, 4, 5};

       print(array);
       reverse(array, 0, 4);
       print(array);
    }
}
