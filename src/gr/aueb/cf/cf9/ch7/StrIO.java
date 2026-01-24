package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class StrIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please enter two strings");
        s1 = scanner.next(); // reads until whitespace(spaces, tabs, next lines)
        s2 = scanner.nextLine(); // reads until next line
        System.out.println(s1 + s2);

    }
}
