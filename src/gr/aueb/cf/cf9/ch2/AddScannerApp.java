package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Reads 2 whole numbers from stdin (Keyboard)
 * and calculates the result
 */
public class AddScannerApp {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.printf("Insert two whole numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1+num2;

        System.out.printf("The result of adding %d and %d is %d\n", num1, num2, sum );
    }
}
