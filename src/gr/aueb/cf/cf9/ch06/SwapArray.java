package gr.aueb.cf.cf9.ch06;

public class SwapArray {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
    swap(arr, 0, 4);
        System.out.println(arr[0]);
        System.out.println(arr[4]);

    }
    public static void swap(int [] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }
}
