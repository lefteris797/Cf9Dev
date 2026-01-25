package gr.aueb.cf.cf9.ch05;

public class PowerRecursiveApp {
    public static void main(String[] args) {
        int base = 3;
        int power = 3;
        int result = power1(base, power);
        System.out.println(result);
    }
    public static int power1(int base, int power){
       if (power == 0){
       return 1;
       }
       return base * power1(base, power-1);
    }
}
