package gr.aueb.cf.cf9.review.seniorlevel;

import java.util.Scanner;

/**
 *Creates a message that contains the name of the user and the age
 */

public class StrConcat {
    public static void main(String[] args) {

        //Declaration of Variables
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        int age = 0 ;
        String sfinal = "";

        //Input of Variables
        System.out.println("Please enter your name");
        s1 = scanner.nextLine();
        System.out.println("Please enter your age");
        while (!scanner.hasNextInt()){
            System.out.println("The value you provided did not contain numbers, please enter only numbers");
            scanner.nextLine();
        }
        age = scanner.nextInt();

        //Delegation
        sfinal = concat(s1, age);

        //Print results
        System.out.println(sfinal);

        /**
         * @s1      users first name
         * @age     users age
         * @sfinal  the message
         */
    }

    public static String concat(String firstname, int age){
    return String.format("Hello my name is %s and my age is %d years old", firstname, age);
    }
}
