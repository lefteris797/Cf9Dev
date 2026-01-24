package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Converts Euros To USD
 */

public class EuroToUsdConverter {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        final double eurToUsd = 1.15;
        double Eur = 0;
        double Usd = 0;

        //Functions
        System.out.printf("Enter the number of Euros you would like to Convert");
        Eur = scanner.nextDouble();
        Usd = Eur * eurToUsd;

        //Results
        System.out.printf("The converter number of USD is %f\n", Usd);

    }
}
