package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * takes a number and gives as a result how many digits this number has
 */
public class DigitsApp {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int digits = 0;
        int a = 10;
        boolean check = true;

        //Commands
        System.out.println("Please enter the number");
        number = scanner.nextInt();


        while (check == true){

            if (number<a){
                digits ++;
                check = false;
            }

            else {
                    a = a*10;
                    digits ++;
            }

        }



        //Results
        System.out.printf("The amount of digits is %d", digits);
    }
}
