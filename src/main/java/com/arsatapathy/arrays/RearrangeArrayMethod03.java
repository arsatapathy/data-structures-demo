package com.arsatapathy.arrays;

// Rearrange an array such that arr[i] = i
// Swap Method
public class RearrangeArrayMethod03 {
    public static void main(String[] args) {
        int[] array = {-1, -1, 6, 1, 9, 3, 2, 8, 4, -1};

        print(array);
        rearrange(array);
        print(array);
    }

    public static void rearrange(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1 && array[i] != i) {
                int x = array[i];

                while (array[x] != -1 && array[x] != x) {
                   int temp = array[x];

                   array[x] = x;

                   x = temp;
                }

                array[x] = x;
            }

            if (array[i] != i) {
                array[i] = -1;
            }
        }
    }

    public static void print(int[] array) {
        System.out.print("{");
        for (int element:
                array) {
            System.out.print(element + ",");
        }
        System.out.println("}");
    }
}
