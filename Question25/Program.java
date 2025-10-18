package Question25;

import java.math.BigInteger;

public class Program {

    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        int count = 2;

        while (b.toString().length() < 1000) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
            count++;
        }

        System.out.println("The index of the first term in the Fibonacci sequence to contain 1000 digits is: " + count);
    }
}
