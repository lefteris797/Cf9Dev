package gr.aueb.cf.cf9.ch7;

public class StrpCopy {
    public static void main(String[] args) {
        String s1 = "athens";
        String s2 = s1;
        s2 = "skg";

//        System.out.println(s1);
//        System.out.println(s2);
        String s3 = s1.substring(3);
        String s4 = s1.substring(1, 3);
//        System.out.println(s3);
//        System.out.println(s4);
        traverse(s1);
    }

    public static void traverse(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.substring(i, i + 1));
        }
    }
}