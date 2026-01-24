package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class AbsTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please enter the number");
        num = scanner.nextInt();
//        if (num < 0) {
//        abs = - num;
//        }
//        else {
//            abs = num;
//        }

        abs = num < 0 ? -num : num ;
        System.out.printf("The abs number is %d", abs);
    }
}
