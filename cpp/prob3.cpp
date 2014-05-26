#include <stdio.h>
#include <math.h>
#include <vector>
#include <set>

using namespace std;

bool isPrime(unsigned long number)
{
	double sqrtNum = sqrt(number);
	for(unsigned long i=2;i<sqrtNum;i++)
	{
		float mod = fmod(number, i);
		if( mod == 0)
		{
			return false;
		}
	}
	return true;
}

int main()
{
	double number = 600851475143;
	double limit = sqrt(number);
	for(unsigned long i=2;i<=limit;i++)
	{
		double mod = fmod(number, i);
		if( mod == 0)
		{
			if(isPrime(i))
			{
      			printf("%lu \n", i);
			}
		}
	}
}
