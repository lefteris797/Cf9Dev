package gr.aueb.cf.cf9.ch05;

public class MethodOverloading {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 2;
        long a2 = 8;
        long b2 = 10;
        int sum1 = add(a,b);
        int sum3 = add(a,b,c);
        long sum2 = add(a2,b2);

    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static long add(long a, long b){
        return a+b;
    }
}
