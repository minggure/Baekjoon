#include <bits/stdc++.h>
using namespace std;

int main() {
	int Price, number, Price2, number2, total = 0;
	cin >> Price;
	cin >> number;
	for (int i = 1; i <= number; i++) {
		cin >> Price2 >> number2;
		total += Price2 * number2;
	}
	if (total == Price) {
		cout << "Yes";
	}
	else { cout << "No"; }

	return 0;
}

