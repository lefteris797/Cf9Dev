package gr.aueb.cf.cf9.ch6;

public class JaggedArrays {
    public static void main(String[] args) {
        int [][] arr = new int[3][];
        arr[0] = new int [2];
        arr[1] = new int [3];
        arr[2] = new int [2];
        arr [0][0] = 1;
        arr [0][1] = 2;
        arr [1][0] = 4;
        arr [1][1] = 5;
        arr [1][2] = 6;
        arr [2][0] = 7;
        arr [2][1] = 8;
        for (int[] row : arr){
            for (int el : row){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
