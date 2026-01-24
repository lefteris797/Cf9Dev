package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result =0;
        System.out.println("Please enter two numbers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        result = power(a,b);
        System.out.println(result);

    }
    public static int power(int base, int power){
    int result = 1;
    for (int i = 1; i <= power; i++)
        result *= base;
    return result;

    }
}
