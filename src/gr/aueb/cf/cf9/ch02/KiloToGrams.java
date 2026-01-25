package gr.aueb.cf.cf9.ch02;

import java.util.Scanner;

/**
 * The user inputs his/her weight in kilos and the application calculates the weight in grams
 */
public class KiloToGrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KiloConvertionToGram = 1000;
        int weightinkilos = 0;
        int weightingrams = 0;

        System.out.println("Input your weight");
        weightinkilos = scanner.nextInt();
        weightingrams = weightinkilos * KiloConvertionToGram;
        System.out.printf("Your weight in grams is %d", weightingrams);


    }
}
