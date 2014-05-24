public class prob14
{	
	public static void main(String[] args) throws Exception
	{
		System.out.println("starting");
		int maxCount = 0;
		int number = 1;
		for(int i=1;i<1000000;i++)
		{
			int count = collatzNumber(i);
			if(count > maxCount)
			{
				maxCount = count;
				number = i;
			}
			//System.out.println(i);
		}
		System.out.println("Collatz number: "+number);
	}

	public static int collatzNumber(double num)
	{
		int count = 0;
		while(num > 1)
		{
			if(num % 2 == 0)
				num = (num/2);
			else
				num = 3*num + 1;
			count++;
		}

		return count;
	}
}