package com.basic;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[][] arr1 = { {1, 2}, {2, 3}, {4, 2} };
        System.out.println(Arrays.deepToString(arr1));
    }
}
