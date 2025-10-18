package Question17;

public class Program {

    public static int numChars(int n){
        int[] onesToNineteen = {0,3,3,5,4,4,3,5,5,4,3,6,6,8,8,7,7,9,8,8};
        int[] tens = {0,0,6,6,5,5,5,7,6,6};

        if (n == 1000) {
            return 11;
        }
        int len = 0;
        if (n >= 100) {
            int hundreds = n / 100;
            len += onesToNineteen[hundreds] + 7;
            int remainder = n % 100;
            if (remainder != 0) {
                len += 3;
                n = remainder;
            } else {
                n = 0;
            }
        }
        if (n >= 20) {
            len += tens[n / 10];
            len += onesToNineteen[n % 10];
            return len;
        }
        if (n > 0) {
            len += onesToNineteen[n];
        }
        return len;
    }
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <=1000; i++){
            total += numChars(i);
        }
        System.out.println(total);
    }
}
