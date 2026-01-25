package gr.aueb.cf.cf9.ch04;

import java.util.Scanner;

public class SwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 5;
        int choice = 0;
        do{
            System.out.println("Welcome\nChoose for the following options\n1.Academy\n2.Programs\n3.Instructions\n4.Help\n5.Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Welcome to Academy");
                    break;
                case 2:
                    System.out.println("Welcome to Programs");
                    break;
                case 3:
                    System.out.println("Welcome to Academy");
                    break;
                case 4:
                    System.out.println("Welcome to Academy");
                    break;
                case 5:
                    System.out.println("You exited the menu");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }



        }
        while (choice != exit);
    }
}
