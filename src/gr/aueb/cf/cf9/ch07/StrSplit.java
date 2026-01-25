package gr.aueb.cf.cf9.ch07;

public class StrSplit {
    public static void main(String[] args) {
        String s1 = "Athens University of Economics and business";
        String[] tokens;
        tokens = s1.split(" ");

        for (String token:tokens){
            System.out.println(token);
        }

    }
}
