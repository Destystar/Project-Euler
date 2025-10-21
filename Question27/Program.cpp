#include <math.h>
#include <iostream>
using namespace std;

bool isPrime(int a){
    for (int i = 2; i <= sqrt(a); i++){
        if (a % i == 0){
            return false;
        }
    }
    return true;
}

int main(){
    int primesMax = 0;

    for (int i = -999; i < 1000; i++){
        bool temp = true;
        for (int j = -1000; j <= 1000; j++){
            int count = 0;
            int n = 0;
            while (temp){
                int temp2 = n*n + i*n + j;
                if (isPrime(temp2)){
                    count++;
                    n++;
                }
                else{
                    temp = false;
                }
            }
            if (count > primesMax){
                primesMax = count;
            }
        }
    }
    cout << primesMax << endl;
    return 0;
}