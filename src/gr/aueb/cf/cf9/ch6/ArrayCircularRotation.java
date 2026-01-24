package gr.aueb.cf.cf9.ch6;

public class ArrayCircularRotation {
    public static void main(String[] args) {

    }
    public static int[] shiftRightBy(int [] arr, int offset){
        if (arr == null) return new int[0];
        if (offset < 0 ) return new int[0];
        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }
    public static int[] RotateBothdirections(int [] arr, int offset){
        if (arr == null) return new int[0];
        int[] rotaded = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            rotaded[(i + offset + arr.length) % arr.length] = arr[i];
        }
        return rotaded;
    }
}
