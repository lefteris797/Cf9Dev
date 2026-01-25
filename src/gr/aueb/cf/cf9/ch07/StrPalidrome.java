package gr.aueb.cf.cf9.ch07;

public class StrPalidrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = (str.length() - 1); i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome2(String s1){
        return new StringBuilder(s1).reverse().toString().equals(s1);
    }
}
