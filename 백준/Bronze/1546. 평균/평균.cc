#include <iostream>
#include <algorithm>

int main() {
    int N;
    double arr[10001];
    std::cin >> N;
    for(int i = 0; i < N; i++){
        std::cin >> arr[i];
    }
    int M = arr[0];
    for (int j = 0; j < N; j++) {
        if (arr[j] > M) {
            M = arr[j];
        }
    }
    double newScore = 0;
    for (int k = 0; k < N; k++) {
        newScore += arr[k] / M * 100;
        
    }
    std::cout.unsetf(std::ios_base::fixed);
    std::cout << newScore / N;

}
