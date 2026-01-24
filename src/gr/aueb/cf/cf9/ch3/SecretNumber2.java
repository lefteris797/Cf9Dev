package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SecretNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 56;
        int num = 0;
        System.out.println("Try to guess the number");
        while (true){

            num = scanner.nextInt();
            if (num != secretNumber){
                System.out.println("You didn't guess correctly, please try again");
                continue;
            }
            System.out.println("You guessed the secret number");
                break;
            }
        }
    }
