#include <stdio.h>
int main() {
	int hour, minute ,time;
	scanf("%d %d\n %d", &hour, &minute , &time);
	minute = time + minute;
	if (minute >= 60) {
		hour += minute / 60;
		minute = minute % 60;
		if (hour >= 24) {
			hour -= 24;
	}
	}

	printf("%d %d", hour, minute);

	return 0;
}