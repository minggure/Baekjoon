#include <stdio.h>

int main() {
	int num1,num2;
	scanf("%d\n%d", &num1,&num2);
	if (num1 > 0 && num2 > 0)
		printf("1");
	else if
		(num1 < 0 && num2 > 0)
		printf("2");
	else if
		(num1 < 0 && num2 < 0)
		printf("3");
	else
		printf("4");
	return 0;
		}