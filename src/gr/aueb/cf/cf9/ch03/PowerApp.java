package gr.aueb.cf.cf9.ch03;

import java.util.Scanner;

/**
 * Calculates the power of a number
 */
public class PowerApp {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int finalResult = 0;
        //Commands
        System.out.println("Please enter the base number");
        base = scanner.nextInt();
        System.out.println("Please enter the power number");
        power = scanner.nextInt();
        finalResult = (int) Math.pow(base, power);
        System.out.printf("The final result is %d", finalResult);

    }
}
