package gr.aueb.cf.cf9.review.seniorlevel;

public class ArrayMax {
    public static void main(String[] args) {
        /**
         * Finds the the max value from a set of numbers in an array
         * @max respresent the max value of the array
         */

        //Declaration of Variables
        int [] arr = {2,5,32,53,5,23,97,34};
        int max = 0;

        //delegations
        max = maxValue(arr);

        //resuts printing
        System.out.println("The max value of the array is " + max);
    }
    public static int maxValue(int [] arr){
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int max = arr[0];
        for (int value : arr){
            if (value > max) max = value;
        }
        return max;
    }
}
