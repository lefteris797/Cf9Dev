package gr.aueb.cf.cf9.ch02;

import java.util.Scanner;

public class YearsToDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                final int DaysInYear = 365;
                int InputAgeInYears = 0;
                int ageInDays = 0;

                System.out.println("Input your Age");
                InputAgeInYears = scanner.nextInt();
                ageInDays = InputAgeInYears * DaysInYear;
                System.out.println("Age in Days" + ageInDays);
    }
}
