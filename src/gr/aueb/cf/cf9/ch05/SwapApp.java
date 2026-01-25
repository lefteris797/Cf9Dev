package gr.aueb.cf.cf9.ch05;

import java.util.Scanner;

public class SwapApp {
    public static void main(String[] args) {
    int x = 0;
    int y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the twon numbers you wish to swap");
        x = scanner.nextInt();
        y = scanner.nextInt();

        Swap(x,y);
        System.out.println(x + " \n" + y);
    }
    public static void Swap(int a, int b){
        int c = 0;
        c = a;
        a = b;
        b = c;


    }
}
