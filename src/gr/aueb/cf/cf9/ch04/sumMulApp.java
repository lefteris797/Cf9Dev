package gr.aueb.cf.cf9.ch04;

public class sumMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        for (int i = 1; i <=10; i ++){
            sum += i;
            mul *= i;
        }
        System.out.printf("The sum is %d\n and the mul is %d",sum , mul);
    }
}
