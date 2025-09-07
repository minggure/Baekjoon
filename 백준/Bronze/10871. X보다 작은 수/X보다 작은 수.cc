#include <bits/stdc++.h>
using namespace std;

int main() {
    int N,A,X = 0;
    int arr[10000];
    cin >> N >> X;
    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }
    for (int j = 0; j < N; j++) {
        if (X > arr[j]) {
            cout << arr[j] << " ";
        }
    }
    

    return 0;
       
    }



