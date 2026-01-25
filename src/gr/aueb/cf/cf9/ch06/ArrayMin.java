package gr.aueb.cf.cf9.ch06;

public class ArrayMin {
    public static void main(String[] args) {
    int [] arr = {3,45,15,74,1,7,256,35};

        System.out.println("The min value of the array is the number " + arr[minPosition(arr)] + " in the position " + (minPosition(arr) + 1));
    }
    public static int minPosition(int [] arr){
        if (arr == null || arr.length == 0 ){
            throw new IllegalArgumentException("The array cannot be empty");
        }
        int min = arr[0];
        int position = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > min){
                min = arr[i];
                position = i;
            }
        }
        return position;
    }
}
