#include <iostream>
using namespace std;

int main() {
	int dice1, dice2, dice3, reward = 0;
	cin >> dice1 >> dice2 >> dice3;
	
	if (dice1 == dice2 && dice1 == dice3) {
		reward = 10000 + dice1 * 1000;
	}
	else if (dice1 == dice2 || dice1 == dice3) {
		reward = 1000 + dice1 * 100;
	}
	else if (dice2 == dice3) {
		reward = 1000 + dice2 * 100;
	}
	else  {
		reward = max(dice1, max(dice2, dice3)) * 100;
	}
	cout << reward;
	return 0;
}