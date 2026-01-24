package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * makes a string upper and lower every different letter
 */
public class UpperLowerCaseApp {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      char ch = ' ';
      System.out.println("Please enter the text to be converted");
      String inputStr = scanner.nextLine();
      for (int i = 0; i < inputStr.length(); i++){
          ch = inputStr.charAt(i);
          if (Character.isLetter(ch)){
              ch = i % 2 == 0 ? Character.toUpperCase(ch): Character.toLowerCase(ch);
          }
          sb.append(ch);
      }
        System.out.println(sb);

    }
}
