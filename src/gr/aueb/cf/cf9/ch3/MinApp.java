package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class MinApp {
    public static void main(String[] args) {
        int num1 =0;
        int num2 = 0;
        int min = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        num1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        num2 = scanner.nextInt();

        min = num1<num2 ? num1 : num2;
        System.out.printf("The min numner is %d", min);
    }
}
