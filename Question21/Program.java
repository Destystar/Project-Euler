package Question21;

public class Program {

    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean checkAmicable(int num1) {
        int num2 = sumOfDivisors(num1);
        return (num1 != num2 && sumOfDivisors(num2) == num1);
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            if (checkAmicable(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of all amicable numbers under 10000: " + sum);
    }
    
}
