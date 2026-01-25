package gr.aueb.cf.cf9.ch05;

public class DeclarationApp {
    public static void main(String[] args) {
        float myFloat = 12.345f;
        double myDouble = 16.664498489;
        int myInt = 10;
        double result = 0.0;

//        System.out.printf("my float is %f and my double is %f", myFloat, myDouble);
        result = myFloat + myDouble + myInt;
        System.out.println(result);
    }

}
