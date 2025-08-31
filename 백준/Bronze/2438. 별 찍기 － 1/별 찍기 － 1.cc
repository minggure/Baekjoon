#include <bits/stdc++.h>
using namespace std;

int main() {
	int N = 0;
	cin >> N;

	for (int i = 1; i < N; i++) {
		cout << "*";
		cout << "\n";
		for (int j = 0; j < i; j++)
			cout << "*";
	}
	cout << "*";
	return 0;

}

