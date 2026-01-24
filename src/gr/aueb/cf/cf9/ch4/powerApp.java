package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class powerApp {

    public static void main(String[] args) {
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int base = scanner.nextInt();
        System.out.println("Please enter the second number");
        int power = scanner.nextInt();

        for (int i = 1; i <= power ; i++){
            result *= base;
        }
        System.out.println(base + "^" + power + "=" + result);


    }
}
