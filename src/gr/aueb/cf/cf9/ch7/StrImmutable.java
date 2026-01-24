package gr.aueb.cf.cf9.ch7;

public class StrImmutable {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Factory";
        System.out.println(s1);
        System.out.println(s2);
    }
}
