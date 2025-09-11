#include <bits/stdc++.h>
int arr[101];
int main() {
  
    int N, M;
    int i, j;
    

    std::cin >> N >> M;
    for (int a = 0; a < N; a++) {
        arr[a] = a + 1;
    }
    for (int k = 0; k < M; k++) {
        std::cin >> i >> j;
        arr[N + 1] = arr[i-1];
        arr[i-1] = arr[j-1];
        arr[j-1] = arr[N + 1];

    }
    for (int i = 0; i < N; i++) {
        std::cout << arr[i] << " ";
        
    }
    return 0;
}

   
   