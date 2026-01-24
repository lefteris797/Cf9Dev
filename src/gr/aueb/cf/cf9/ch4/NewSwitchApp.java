package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class NewSwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Please enter your grade");
        choice = scanner.nextInt();
        switch (choice) {
            case 1, 2, 3, 4, 5 -> System.out.println("Failed the class");
            case 6, 7 -> System.out.println("Adequate");
            case 8, 9 -> System.out.println("Very Good");
            case 10 -> System.out.println("Excellent");
            default -> System.out.println("Error");
        }
        }
    }
