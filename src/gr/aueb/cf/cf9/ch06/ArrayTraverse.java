package gr.aueb.cf.cf9.ch06;

public class ArrayTraverse {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] grades = {1, 2, 3, 4, 5};
        int[] scores = new int[]{23, 45, 64, 21};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
        for (int i: scores){
            System.out.println(i);
        }
    }
}
