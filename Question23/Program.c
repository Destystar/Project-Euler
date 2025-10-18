#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int DivisorSum(int n){
	int sum = 0;
	for(int i = 1; i <= n/2; i++){
		if(n % i == 0){
			sum += i;
		}
	}
	return sum;
}

bool two_sum_exists(const int *arr, int n, int target){
	int i = 0;
	int j = n - 1;
	while(i <= j){
		long s = (long)arr[i] + (long)arr[j];
		if(s == target) return true;
		if(s < target) i++;
		else j--;
	}
	return false;
}

int main(void){
	int abundant[10000];
	int m = 0;
	for(int i = 1; i <= 28123; i++){
		if(DivisorSum(i) > i){
			abundant[m++] = i;
		}
	}

	long total = 0;
	for(int n = 1; n <= 28123; n++){
		if(!two_sum_exists(abundant, m, n)){
			total += n;
		}
	}

	printf("%ld\n", total);
	return 0;
}