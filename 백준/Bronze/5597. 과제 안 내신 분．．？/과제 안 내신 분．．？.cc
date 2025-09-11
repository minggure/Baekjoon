#include <iostream>

int main() {
	int arr[30];
	int M = 30;
	int k;
	for (int i = 0; i < M; i++) {
		arr[i] = i + 1;

	}
	for (int j = 0; j < 28; j++) {
		std::cin >> k;
		arr[k - 1] = 0;
	}
	for (int i = 0; i < M; i++) {
		if (arr[i] > 0) {
			std::cout << arr[i] << std::endl;
			
		}
	}


	return 0;
}
