#include <bits/stdc++.h>
int arr[101];
int main() {
  
    int N, M;
    int i, j, k;
    

    std::cin >> N >> M;
    for (int a = 0; a < M; a++) {
        std::cin >> i >> j >> k;
        for (; i <= j;i++) {
            arr[i-1] = k;
        }



    }
    for (int i = 0; i < N; i++) {
        std::cout << arr[i] << " ";
        
    }
    return 0;
}
