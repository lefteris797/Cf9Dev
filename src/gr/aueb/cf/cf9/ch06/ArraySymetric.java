package gr.aueb.cf.cf9.ch06;

public class ArraySymetric {
    public static void main(String[] args) {
        int [] array = {1,2,3,3,7,1};
        if (Symetric(array) == true) {
            System.out.println("They are symmetric");
        }
            else {
            System.out.println("They are not symmetric");
        }
    }
public static boolean Symetric(int[] arr){
        int i = 0;
        int j = arr.length - 1;
//        while (i <= arr.length/2 && j >= arr.length/2) {
//            if (arr[i] == arr[j]){
//            }
//            else{
//                check = false;
//            }
//            i ++;
//            j --;
//        }
    for ( i = 0, j = arr.length - 1; i < j; i++, j--){
        if (arr[i] != arr[j]){
            return false;
        }
    }
    return true;
}
}
