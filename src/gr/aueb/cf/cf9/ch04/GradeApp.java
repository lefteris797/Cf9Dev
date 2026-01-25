package gr.aueb.cf.cf9.ch04;

import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exit = 5;
        int choice = 0;
        System.out.println("Please enter your grade");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Failed the class");
                break;
            case 6:
            case 7:System.out.println("Adequate");
                break;
            case 8:System.out.println("Good");
                break;
            case 9:System.out.println("Very Good");
                break;
            case 10:System.out.println("Excellent");
            break;
            default:
                System.out.println("Error");
                break;
        }
    }

}
