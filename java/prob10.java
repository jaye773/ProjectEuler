import java.util.ArrayList;

public class prob10
{
	private static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
		primes.add(2);
		primes.add(3);
		for(int i=4;i<2000000;i++)
		{
			isPrime(i);
		}

		long sum = 0;
		for(Integer i : primes)
		{
			sum+=i;
		}
		System.out.println("Sum of primes is "+sum);
	}

	public static boolean isPrime ( int num )
	{
	    boolean prime = true;
	    int limit = (int) Math.sqrt ( num );  

	    for ( int i = 2; i <= limit; i++ )
	    {
	      if ( num % i == 0 )
	      {
	        prime = false;
			break;
	      }
	    }

	    if(prime)
	    {
	    	primes.add(num);
	    }

		return prime;
	}	

}