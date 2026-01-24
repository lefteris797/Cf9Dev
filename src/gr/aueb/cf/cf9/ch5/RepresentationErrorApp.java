package gr.aueb.cf.cf9.ch5;

public class RepresentationErrorApp {
    public static void main(String[] args) {
        double num1 = 0.0;
        double num2 = 1.0;
        for (int i = 0; i< 10; i++)
            num1 = num1 +0.1;
        System.out.println(num1);
    }
}
