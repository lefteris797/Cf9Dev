package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 *  Deletes the spaces before and after the input
 */
public class StrTrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you name");
        String name = scanner.nextLine().trim();
        System.out.println(name);
    }
}
