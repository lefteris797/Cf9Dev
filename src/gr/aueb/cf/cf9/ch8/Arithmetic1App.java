package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic1App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("enter a number");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        result = num1/num2;
        System.out.println(result);
    }
}
