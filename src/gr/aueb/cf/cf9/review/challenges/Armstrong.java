package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0;
        System.out.println("Please enter the number to checked if it is Armstrong");
         num = scanner.nextInt();
         if (isArmstrong(num) == true){
             System.out.println("The number " + num + " is Armstrong");
         }
         else
             System.out.println("The number " + num + " is not Armstrong");
    }
    public static boolean isArmstrong(int num){
        int a = 10;
        int count = 0;
        int digit = 0;
        int initialnumber = num;
        int sum = 0;

        for (int i = 1; i <= num; i *= 10){
            count ++;
        }
       while (num != 0){
           digit = num % 10;
           sum += (int) Math.pow(digit,count);
           num /= 10;
       }
       return (sum == initialnumber);

    }
}
