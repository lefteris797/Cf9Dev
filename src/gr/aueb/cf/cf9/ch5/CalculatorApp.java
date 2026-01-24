package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        int a = 0;
        int b = 0;
        int result = 0;
        while (true) {
            printMenu();
            choice = scanner.nextInt();
            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice, please try again");
                continue;
            }
            if (choice == 6){
                System.out.println("You exited the game");
                break;
            }
            System.out.println("please enter the first number");
            a = scanner.nextInt();
        System.out.println("please enter the second number");
        b = scanner.nextInt();
        result = res(choice,a,b);
        System.out.println(result);
    }
        }
    public static int res(int choice, int a, int b){
        int result = 0;
        switch (choice) {
            case 1:
                result = add(a, b);
            case 2:
                result = minus(a, b);
            case 3:
                result = multi(a, b);
            case 4:
                result = division(a, b);
            case 5:
                result = mod(a, b);
        }
        return result;
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static int minus(int num1, int num2){
        return num1-num2;
    }
    public static int multi(int num1, int num2){
        return num1*num2;
    }
    public static int division(int num1, int num2){
        return num1/num2;
    }
    public static int mod(int num1, int num2){
        return num1%num2;
    }
    public static void printMenu(){
        System.out.println("Please select one the following choices.\n 1.Sum\n 2.Minus\n 3.Multi\n 4.Division\n 5.Mod\n 6.Exit");
    }
}
