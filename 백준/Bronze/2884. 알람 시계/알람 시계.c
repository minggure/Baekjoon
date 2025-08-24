#include <stdio.h>
int main() {
	int hour, minute;
	scanf("%d %d",&hour ,&minute);
	if (minute < 45) {
		hour = hour - 1;
		minute = minute + 60 - 45;
	}
	else {
		minute = minute - 45;
	}
	if (hour < 0)
		hour = hour + 24;
	printf("%d %d", hour, minute);

	return 0;
		}