package gr.aueb.cf.cf9.ch03;

import java.util.Scanner;

/**
 *
 */
public class FactoriaApp {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int counter = 0;
        int finalNumber = 1;

        //Commands
        System.out.println("Enter the desired number to be factoried");
        counter = scanner.nextInt();
        while (i <= counter){
            finalNumber *= i ;
            i++;
        }
        System.out.printf("The result factoried number is %d", finalNumber);
    }
}
