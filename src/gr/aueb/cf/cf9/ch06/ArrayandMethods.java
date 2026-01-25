package gr.aueb.cf.cf9.ch06;

public class ArrayandMethods {
    public static void main(String[] args) {
        int [] aar = new int[]{1,4,6,8,45,34};
        System.out.println(aar.length);
        printArray(aar);
        printArray(aar, 1, aar.length);
    }
   public static void printArray(int[] arr) {
       for (int item : arr) {
           System.out.println(item + " ");
       }
   }
    public static void printArray(int[] arr,int low,int high){
       if (low < 0 || low > high || high > arr.length){
           return;
       }
       else
       for (int i = low; i < high; i++ ){
           System.out.println(arr[i]);
       }
    }
    public static int[] getArray5(){
        return new int[5];

    }
}
