#include <stdio.h>

int main()
{
	int sum = 0, result = 0, first = 0, second = 1;
	while(result<4000000)
	{
		result = first + second;
		first = second;
		second = result;
		if((result % 2) == 0) 
		{
			sum += result;
		}
	}
	printf("Sum of all the fib numbers below 4 million is %d.\n", sum);
}