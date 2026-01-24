package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Second way to calculate the power of a given number
 */
public class PowerApp2 {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int i = 1;
        int finalResult = 0;
        //Commands
        System.out.println("Please enter the base number");
        base = scanner.nextInt();
        System.out.println("Please enter the power number");
        power = scanner.nextInt();

        while (i <= power) {
            finalResult *= base;
            i++;
        }
        System.out.printf("The final result is %d", finalResult);
    }
}
