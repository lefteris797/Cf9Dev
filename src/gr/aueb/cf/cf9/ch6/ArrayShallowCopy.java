package gr.aueb.cf.cf9.ch6;

public class ArrayShallowCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1; // Shallowcopy
        arr2[0] = 1000;
        System.out.println(arr1[0]);
    }
}
