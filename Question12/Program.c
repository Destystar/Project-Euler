#include <stdio.h>

int main(void) {
    long long n = 1;
    while (1) {
        long long triangle = n * (n + 1) / 2;
        int divisors = 0;

        for (long long i = 1; i * i <= triangle; i++) {
            if (triangle % i == 0) {
                divisors += (i * i == triangle) ? 1 : 2;
            }
        }

        if (divisors > 500) {
            printf("%lld\n", triangle);
            break;
        }
        n++;
    }
    return 0;
}