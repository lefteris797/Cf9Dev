package gr.aueb.cf.cf9.ch2;

/**
 * Adds two whole numbers and overflows as a result
 */
public class OverflowApp {
    public static void main(String[] args) {
        //Variables
        int num1 = Integer. MAX_VALUE;
        int num2 = 1;
        int result = 0;

        //Commands
        result = num1 + num2;

        //print
        System.out.println("Το αποτέλεσμα ειναι:" + result);
    }

}



