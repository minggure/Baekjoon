#include <iostream>


int main() {
	int N,min;
	int max = 0;
	int arr[1000001];
	std::cin >> N;
	for (int i = 0; i < N; i++) {
		std::cin >> arr[i];
	}
	int minVal = arr[0];
	int maxVal = arr[0];

	for (int j = 0; j < N; j++){
		if (arr[j] > maxVal) {
			maxVal = arr[j];
		}
		else if (arr[j] < minVal) {
			minVal = arr[j];
		}
	}
	std::cout << minVal << " " << maxVal;
	
	
}
