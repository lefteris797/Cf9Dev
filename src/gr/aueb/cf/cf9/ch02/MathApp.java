package gr.aueb.cf.cf9.ch02;

public class MathApp {
    public static void main(String[] args) {
        int die = 0;
        die = (int) (Math.random()*6) + 1 ;
        System.out.println("Minimum between 3 and 5 is " + Math.min(3,5));

        System.out.println(die);

    }
}
