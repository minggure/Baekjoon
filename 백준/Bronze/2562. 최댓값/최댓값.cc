#include <bits/stdc++.h>

int arr[10];
int main() {
    int N = 0;
    for (int i = 0; i < 9; i++) {
        std::cin >> arr[i];
    }
    int maxVal = arr[0];
    int num = 0;
    for (int j = 0; j < 9; j++) {
        if (arr[j] > maxVal) {
            maxVal = arr[j];
            num = j;
        }
    }
    std::cout << maxVal << std::endl << num+1;

       
    }

