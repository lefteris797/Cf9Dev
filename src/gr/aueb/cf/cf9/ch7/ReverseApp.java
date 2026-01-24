package gr.aueb.cf.cf9.ch7;

public class ReverseApp {
    public static void main(String[] args) {
        String s1 = "abc";
    }
    public static String reverseString(String s1){
        StringBuilder reversed = new StringBuilder();
        for (int i = s1.length() - 1; i >= 0; i--){
            reversed.append(s1.charAt(i));
        }
        return reversed.toString();
    }
    public static String reverse2(String s1){
        return new StringBuilder(s1).reverse().toString();
    }
}
