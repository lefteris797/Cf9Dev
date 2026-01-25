package gr.aueb.cf.cf9.ch03;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secretNumber = 56;
        int num = 0;

        while (true){
            System.out.println("Try to guess the number");
            num = scanner.nextInt();
            if (num == secretNumber){
                System.out.println("You guessed the secret number");
                break;
            }
            else {
                System.out.println("You didn't guess correctly, please try again");
            }
        }

    }
}
