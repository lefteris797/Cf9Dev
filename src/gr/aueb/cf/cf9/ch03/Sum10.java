package gr.aueb.cf.cf9.ch03;

public class Sum10 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(i<=10){
            sum +=i; // sum = sum +i
            i ++;
        }
        System.out.printf("%d",sum);
    }
}
