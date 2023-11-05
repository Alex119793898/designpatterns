package com.caoliang.strategy;

public class Sorter {

    public static void sort(int[] arr){
        for(int i =0; i<arr.length; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(Cat[] arr){
        for(int i =0; i<arr.length; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                minPos = arr[j].compareTo(arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private static void swap(Cat[] arr, int i, int j) {
        Cat temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
