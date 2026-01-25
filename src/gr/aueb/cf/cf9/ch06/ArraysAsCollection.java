package gr.aueb.cf.cf9.ch06;



public class ArraysAsCollection {
    public static void main(String[] args) {
        int [] arr = {1, 2 , 3, 4 ,5 ,6 ,7 ,8, 9 ,15};
    }
    public static int[] filterEven(int[] arr){
        if (arr == null || arr.length == 0) return new int[0];
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i <= (arr.length - 1); i++){
            if (arr[i] % 2 == 0){
                temp[j] = arr[i];
                j++;
            }
        }
        int [] result = new int[j];
        for (int i = 0; i < j; i++){
            result[i] = temp[i];
        }
        return result;
    }
    public static int[] maptoDouble(int [] arr){
        if (arr == null || arr.length == 0) return new int[0];
        int[] mapped = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }
    public static int sum(int [] arr){
        if (arr == null || arr.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int sum2(int[] arr){
        int sum2 = 0;
        for (int el : arr){
            sum2 += el;
        }
        return sum2;
    }
   public static double avg(int[] arr){
            return sum(arr) / (double) arr.length;
        }
   public static boolean anyEven(int[] arr){
        for (int el : arr){
            if (el % 2 == 0) return true;

        }
       return false;
    }
    public static boolean allEven(int[] arr){
        for (int el: arr){
            if (el % 2 != 0) return false;
        }
        return true;
    }
    public static boolean moreThanTwoEvens(int[] arr){
//        int count = 0;
//        for (int el : arr){
//            if (el % 2 == 0) count++;
//        }
//        return count > 2;
        int count = 0;
        for (int el : arr){
            if (el % 2 == 0) count++;
            if (count > 2) return true; // early exit
        }
        return false;
    }
   }


