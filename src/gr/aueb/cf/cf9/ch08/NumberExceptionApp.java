package gr.aueb.cf.cf9.ch08;

import java.util.Scanner;

public class NumberExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String input = "";

        System.out.println("please enter a number");
        while (!isInteger(scanner.nextLine())){
            System.out.println("Not accepted characters");
        }
        input = scanner.nextLine();
        num = Integer.parseInt(input);
        System.out.println(num);
    }
    public static boolean isInteger(String s){
        return s.matches("-?[0-9]+");
    }
}
