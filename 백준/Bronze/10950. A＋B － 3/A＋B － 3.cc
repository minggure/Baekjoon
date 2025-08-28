#include <bits/stdc++.h>
using namespace std;

int main(){
	int A ,B ,T;
	int arr[100];
	cin >> T;
	for (int i = 0; i < T; i++) {
		cin >> A >> B;
		for (int j = 0; j <= T; j++) {
			arr[i] = A + B;
		}
	}
	for (int i = 0; i < T; i++) {
		cout << arr[i] << endl;
	}
	return 0;
}