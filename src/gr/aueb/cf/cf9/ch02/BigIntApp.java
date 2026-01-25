package gr.aueb.cf.cf9.ch02;

import java.math.BigInteger;

public class BigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("123456789");
        BigInteger bigNum2 = new BigInteger("987654321");
        BigInteger bigResult;

        bigResult = bigNum1.add(bigNum2);
        System.out.printf("bigResult: %,d", bigResult );

    }
}
