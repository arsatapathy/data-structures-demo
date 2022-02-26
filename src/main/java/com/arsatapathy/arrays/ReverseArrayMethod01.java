package com.arsatapathy.arrays;

// Given an array {1, 2, 3, 4, 5} print its reverse {5, 4, 3, 2, 1}
// Iterative Method - Time Complexity o(n)
public class ReverseArrayMethod01 {

    public static void reverse(int[] arr) {
        int length = arr.length;

        int start = 0;
        int end = length -1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
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
        reverse(array);
        print(array);
    }
}
