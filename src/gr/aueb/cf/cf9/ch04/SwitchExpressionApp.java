package gr.aueb.cf.cf9.ch04;

import java.util.Scanner;

public class SwitchExpressionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;
        char classification = ' ';
        System.out.println("Please enter your grade");
        grade = scanner.nextInt();

        classification = switch (grade){
            case 1,2,3,4,5 -> 'A';
            case 6,7,8 -> 'B';
            case 9,10 -> 'C';
            default -> 'F';
        };
        System.out.println(classification);
    }
}
