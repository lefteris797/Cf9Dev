package gr.aueb.cf.cf9.ch6;

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arrcopy;
        arrcopy = copyarr(arr1);
        arrcopy[0] = 1000;
        System.out.println(arrcopy[0]);
    }
    public static int[] copyarr(int[] arr){
        int destinationarr[] = new int[arr.length];
        for (int i = 0; i<= arr.length-1; i++){
            destinationarr[i] = arr[i];
        }
        return destinationarr;
    }
}
