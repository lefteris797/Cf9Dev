package gr.aueb.cf.cf9.review.seniorlevel;

import java.util.Scanner;

public class EvenApp {
    public static void main(String[] args) {

        /**
         * Checks if number is even
         * @param num the number to check
         * @return true if the number is even false if not
         */

        //Declaration of variables
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        //Input of data,Validation, Data Biding
        System.out.println("Please enter the number to be checked if even");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input.Please enter a number");
            scanner.next();
        }
        num = scanner.nextInt();

        //Business Logic
        if (result == isEven(num)){
            System.out.println("The number " + num + " is even");
        }
        else System.out.println("The number " + num + " is not even");
    }
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
