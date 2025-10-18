package Question15;

import java.math.BigInteger;

public class Program {
    public static void main(String[] args){
        //Need to work out C(40, 20)
        BigInteger n = BigInteger.valueOf(40);
        for (int i = 39; i > 0; i--){
            n = n.multiply(BigInteger.valueOf(i));
        }
        BigInteger r = BigInteger.valueOf(20);
        for (int i = 19; i > 0; i--){
            r = r.multiply(BigInteger.valueOf(i));
        }
        r = r.multiply(r);
        BigInteger fin = n.divide(r);
        System.out.println(fin);

    }
    
}
