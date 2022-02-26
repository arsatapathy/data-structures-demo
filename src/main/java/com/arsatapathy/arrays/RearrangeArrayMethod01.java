package com.arsatapathy.arrays;

// Rearrange an array such that arr[i] = i
// Naive approach - Time Complexity O(n2)
public class RearrangeArrayMethod01 {

    public static void main(String[] args) {
        int[] array = {-1, -1, 6, 1, 9, 3, 2, 8, 4, -1};

        print(array);
        rearrange(array);
        print(array);
    }

    public static void rearrange(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[j] == i) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                    break;
                }
            }
        }

        for (int k = 0; k < length; k++) {
            if (array[k] != k) {
                array[k] = -1;
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
