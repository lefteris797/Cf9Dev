package gr.aueb.cf.cf9.review.challenges;

/**
 * Array with n positions from 1 to n+1
 * Example [1,2,3,5]
 */
public class Missingelement {
    public static void main(String[] args) {
    int [] arr = {1,2,3,5};
    int missingEl;
    missingEl = findMissingElem2(arr);
        System.out.println(missingEl);
    }
    public static int findMissingElem(int[] arr){
        int firstNum = arr[0];
        int position = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != (arr[i] - 1)){
                position = i;
            }
        }
        return (arr[position] - 1);
    }
    public static int findMissingElem2(int[] arr){
        int expectedSum = 0;
        int actualSum = 0;
        int n = arr.length + 1;
        expectedSum = (n * (n+1))/2;
        for (int item : arr){
            actualSum += item;
        }
        return expectedSum - actualSum;
    }
}
