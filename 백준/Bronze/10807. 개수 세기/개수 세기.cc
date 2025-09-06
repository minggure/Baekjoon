#include <bits/stdc++.h>
using namespace std;

int main() {
    int N = 0;
    int arr[100];
    int num = 0;
    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }
    int V = 0;
    cin >> V;
    for (int j = 0; j < N; j++){
        if (arr[j] == V)
            num += 1;
    }
    cout << num;

    return 0;
       
    }

