package gr.aueb.cf.cf9.ch03;

import java.util.Scanner;

/**
 *
 */
public class TemperatureApp {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;
        // Input
        System.out.println("Please insert the temperature");
        temperature = scanner.nextInt();

        //Commands
        isTempBelowZero = temperature < 0 ;

        //Print of results
        System.out.printf("The fact that the temperature is bello zero is: %b\n", isTempBelowZero);
    }
}
