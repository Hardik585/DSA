package com.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void sortBubble(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            boolean isSortedArray = true;
            for (int j = 0; j < arr.length - 1 -i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSortedArray=false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(isSortedArray){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {31, 6, 5, 45, 60, 4};
        BubbleSort.sortBubble(arr);

        Arrays.stream(arr).forEach((e) ->System.out.println(e));
    }
}
