package gr.aueb.cf.cf9.ch6;

import static gr.aueb.cf.cf9.ch6.ArrayandMethods.printArray;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,76,23,4,64,31};
        int [] sorted = new int[6];

        System.out.println("The initial Array is");
        printArray(arr);
        System.out.println();
        System.out.println("The sorted Array is");
        printArray(selectionSort(arr));
    }
    public static int[] selectionSort(int [] arr){
        int minPosition;
        int minValue;
        for (int  i = 0; i < arr.length; i++){
            minPosition = i;
            minValue = arr[minPosition];
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < minValue){
                    minPosition = j;
                    minValue = arr[minPosition];
            }
            }
            swap(arr, minPosition, i);
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
}
