package gr.aueb.cf.cf9.ch01;

/**
* Adds two numbers and shows the results
*/
public class AddAPP {
    public static void main(String[] args) {

        //variables
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // Commands
        result = num1 + num2;

        // Prints
        System.out.println("The result is " + result);
        System.out.println("The result of " + num1 + " and " + num2 + " is " + result);
        System.out.printf("The result of %d + %d is %d\n", num1, num2, result);
    }
}
