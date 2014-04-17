#include <map>

class FibHolder
{
	std::map<int, int> results_map;
	public:
	    int fib(int num);
};

int FibHolder::fib(int n)
{
	if( n < 0) { throw 0;}

	auto result = results_map.find(n);
	if(result != results_map.end()) return result->second;

	if( n == 0 || n == 1 )
	{
		return n;
	}

	int tmp = fib(n - 1) + fib(n - 2);
	results_map[n] = tmp;
	return tmp;
}

int main()
{
	int sum = 0, tmp = 0, i = 0;
	FibHolder fib;
	while(tmp<4000000)
	{
		if((tmp % 2) == 0) 
		{
			sum += tmp;
		}
		i++;
		tmp = fib.fib(i);
		printf("fib: %d.\n", tmp);
	}
	printf("Sum of all the fib numbers below 4 million is %d.\n", sum);
}