#include <stdio.h>

int main()
{
	double sum = 0;
	double sum1 = 0;
	for(int i=1;i<=100;i++)
	{
		sum += i;
		sum1 += i*i;
	}
	printf("%f \n", (sum-sum1));
}