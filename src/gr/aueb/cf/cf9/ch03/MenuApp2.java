package gr.aueb.cf.cf9.ch03;

import java.util.Scanner;

public class MenuApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true){
            System.out.println("Please Choose on of the following options to proceed");
            System.out.println("1. Factorial");
            System.out.println("2. Positive Count");
            System.out.println("3. Snowing");
            System.out.println("4. Power");
            System.out.println("5. Interations Count");
            System.out.println("6. Exit");
            choice = scanner.nextInt();
            if (choice == 6) {
                break;
            }
        }
        System.out.println("Thank you for using the program");
    }
}
