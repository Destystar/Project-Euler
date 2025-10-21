#include <math.h>
#include <iostream>
using namespace std;

bool isPrime(int a){
    if (a <= 1) return false;
    if (a == 2) return true;
    if (a % 2 == 0) return false;
    
    for (int i = 3; i <= sqrt(a); i += 2){
        if (a % i == 0){
            return false;
        }
    }
    return true;
}

int main(){
    int primesMax = 0;
    int bestA = 0, bestB = 0;

    for (int a = -999; a < 1000; a++){
        for (int b = -1000; b <= 1000; b++){
            int count = 0;
            int n = 0;
            while (true){
                int result = n*n + a*n + b;
                if (isPrime(result)){
                    count++;
                    n++;
                }
                else{
                    break;
                }
            }
            if (count > primesMax){
                primesMax = count;
                bestA = a;
                bestB = b;
            }
        }
    }
    cout << "Maximum consecutive primes: " << primesMax << endl;
    cout << "Coefficients: a = " << bestA << ", b = " << bestB << endl;
    cout << "Product: " << bestA * bestB << endl;
    return 0;
}