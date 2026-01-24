package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int searchvalue = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value you want to search for");
        searchvalue = scanner.nextInt();
        searchvalue = searchInArray(arr, searchvalue);
        if (searchvalue == 0) {
            System.out.println("Number you provided is not in the array");
        }
        else{
        System.out.println("Number you provides is inside the Array");
        }
    }
    public static int searchInArray(int[] arr1, int value){
        for (int i = 0; i < arr1.length;  i ++){
            if (arr1[i] == value){
                return 1;
            }
        }
        return 0;
    }
}
