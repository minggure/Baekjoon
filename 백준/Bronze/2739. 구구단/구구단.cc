#include <iostream>
using namespace std;

int main() {
	int num1;
	cin >> num1;
	for (int i = 1; i <= 9; i++) {
		//printf("%d * %d %d\n", num1, i , num1*i);
		cout << num1 << " * " << i << " = " << num1 * i << endl;
	}
	return 0;
}