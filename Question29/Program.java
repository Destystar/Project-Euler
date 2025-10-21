package Question29;

import java.util.*;
import java.math.BigInteger;

public class Program {
    public static void main(String[] args) {
        Set<BigInteger> nums = new HashSet<>();
        for (int a = 2; a <= 100; a++){
            for (int b = 2; b <= 100; b++){
                BigInteger num = BigInteger.valueOf(a).pow(b);
                nums.add(num);
            }
        }
        System.out.println(nums.size());
    }
}
