package gr.aueb.cf.cf9.ch05;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        int num = 0;
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("please enter the number to find the factorial");
        num = scanner.nextInt();
        factorial = facto(num);
        System.out.println("The factorial is " + factorial);





    }
    public static int facto(int n){
        int factorial = 1;
        for (int i = 1; i <=n; i++)
            factorial *= i;
        return factorial;
    }
}
