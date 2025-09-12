#include <iostream>

int main() {
	int sum = 0;
	int arr[10];
	int rmndr[10];
	for (int i = 0; i < 10; i++) {
		std::cin >> arr[i];
		rmndr[i] = arr[i] % 42;
	}
	for (int j = 0; j < 10; j++) {
		bool isNew = true;
		for(int k = 0 ; k < j; k++ ){
			if(rmndr[j] == rmndr[k]){
				isNew = false;
				break;
				
			
			 }
			
		}
		if (isNew) sum++;
	}
	std::cout << sum << std::endl;

	return 0;
}
