#include <iostream>
#include <algorithm>

int main() {
    int N, M;
    int arr[100001];
    int i, j;
    std::cin >> N >> M;

  
    for (int a = 0; a < N; a++) {
        arr[a] = a + 1;
    }


    for (int b = 0; b < M; b++) {
        std::cin >> i >> j;
        i--; 
        j--;

        for (int k = 0; k <= (j - i) / 2; k++) {
            std::swap(arr[i + k], arr[j - k]);
        }
    }
    for (int a = 0; a < N; a++) {
        std::cout << arr[a] << " ";
    }
}
