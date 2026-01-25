package gr.aueb.cf.cf9.ch05;

import java.util.Scanner;

public class EvenOddApp {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number");
        a = scanner.nextInt();

        if (isEven(a))
            System.out.println("The number is odd");
        else
            System.out.println("the number is even");

    }
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
}
