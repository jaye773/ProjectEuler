public class prob3
{
	public static void main(String[] args)
	{
		long num = 600851475143L;
		double sqrt = Math.sqrt(num);
		for(long i = 2;i < sqrt; i++)
		{
			if( num % i == 0 && IsPrime(i))
			{
				System.out.println("Prime Factor: "+i);
			}
		}
	}

	public static boolean IsPrime(long num)
	{
		double sqrt = Math.sqrt(num);
		for(long i=2;i<sqrt;i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}