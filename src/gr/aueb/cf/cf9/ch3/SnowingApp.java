package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int temperatute = 0;
        boolean isRaining = false;
        boolean snowing = false;
        //Input
        System.out.printf("Is it Raining? false/true");
        isRaining = scanner.nextBoolean();
        System.out.printf("What is the temperature?");
        temperatute = scanner.nextInt();
        //Commands
        snowing = isRaining && temperatute < 0;
        //Prints
        System.out.printf("The statement that is snowing outside is: %b\n", snowing);
    }
}
