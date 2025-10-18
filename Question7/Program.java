package Question7;

public class Program {
    public static void main(String[] args) {
        int num = 0;
        int i = 2;
        boolean isPrime = true;
        while (num < 10001){
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                } 
            }
            if (isPrime){
                num++;
            }
            isPrime = true;
            i++;
        }

        System.out.println(i-1);

    }
}
