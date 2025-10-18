#include <cstdio>
#include <algorithm>
using namespace std;

int main() {
    int digits[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    for (int i = 0; i < 999999; i++){
        next_permutation(digits, digits + 10);
    }
    for (int i = 0; i < 10; i++) {
        printf("%d", digits[i]);
    }
    printf("\n");
    return 0;
}