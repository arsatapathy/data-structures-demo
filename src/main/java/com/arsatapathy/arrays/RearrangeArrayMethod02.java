package com.arsatapathy.arrays;

import java.util.HashSet;
import java.util.Set;

// Rearrange an array such that arr[i] = i
// Using Set - Time Complexity O(n)
public class RearrangeArrayMethod02 {

    public static void main(String[] args) {
        int[] array = {-1, -1, 6, 1, 9, 3, 2, 8, 4, -1};

        print(array);
        rearrange(array);
        print(array);
    }

    public static void rearrange(int[] array) {
        Set<Integer> set = new HashSet<>();

        for (int element:
             array) {
            set.add(element);
        }

        for (int i = 0; i < array.length; i++) {
            if (set.contains(i))
                array[i] = i;
            else
                array[i] = -1;
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
