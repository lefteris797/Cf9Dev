package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        //Variables
        int numerator =0;
        int denominator =0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        //Commands

        while (true){
            System.out.println("Please enter the numerator");
            numerator = scanner.nextInt();
            System.out.println("Please enter the denominator");
            denominator = scanner.nextInt();
            if (denominator==0) {
                System.out.println("Please enter a denominator different than 0");
                continue;
            }
            else {
                result = numerator / denominator;
                break;
            }

        }
        System.out.printf("The result is %d", result);

    }
}
