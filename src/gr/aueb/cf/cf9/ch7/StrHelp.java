package gr.aueb.cf.cf9.ch7;

public class StrHelp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";
        String s3 = "ATHENS";
        String s4 = new String("Athens");
        String s5 = "Athens";

        boolean equals1 = s1 == s2;
        boolean equals2 = s3 == s4;
        boolean equals3 = s1.equals(s5);
        boolean equals4 = s2.equals(s4);
        boolean equals5 = s1.equalsIgnoreCase(s4);
        System.out.println(equals1 + " " + equals2 + " " + equals3);

        if (s1.compareTo(s2) > 0){
            System.out.println("s1>s2");
        } else if (s1.compareTo(s2) < 0 ) {
            System.out.println("s1<s2");
        }
        else {
            System.out.println("s1 = s2");
        }
    }
}
