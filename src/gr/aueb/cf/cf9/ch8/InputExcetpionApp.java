package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class InputExcetpionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        System.out.println("please enter a number");
//        num1 = scanner.nextInt();
        while (!scanner.hasNextInt()){
            System.out.println("Not acceptable characters");
            scanner.next();
        }
        num1 = scanner.nextInt();

        System.out.println("Num" + num1);

    }
}
