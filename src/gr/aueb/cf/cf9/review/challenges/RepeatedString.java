package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        int times = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your text");
        String inputString = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb = repeatedStr(inputString, times);
        System.out.println(sb);
    }
    public static StringBuilder repeatedStr(String s1, int times){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(s1);
        }
        return sb;
    }
}
