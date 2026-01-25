package gr.aueb.cf.cf9.ch02;

import java.util.Scanner;

/**
 * Converts Hours to Minutes and seconds
 */

public class HoursToMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int convertionhourstomin = 60;
        final int convertionhourstosec = 3600;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Insert the amount of Hours");
        hours = scanner. nextInt();
        minutes = hours * convertionhourstomin;
        seconds = hours * convertionhourstosec;

        System.out.printf("The number of hours in minutes is %d\n", minutes);
        System.out.printf("The number of hours in seconds is %d\n", seconds);
    }
}
