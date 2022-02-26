package com.arsatapathy.arrays;

public class LargestSumSubArrayMethod01 {

    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, 3, 4, -5};
        System.out.println(largestSumArray(array));
    }


    public static int largestSumArray(int[] array) {
        int max_sum = Integer.MIN_VALUE;
        int temp = 0;

        for (int j : array) {
            temp += j;

            if (temp < 0)
                temp = 0;

            if (temp > max_sum)
                max_sum = temp;

        }

        return max_sum;
    }

}
