public class prob2
{
	public static void main(String[] args)
	{
		int sum = 0, result = 0, first = 0, second = 1;
		while(result <= 4000000)
		{
			result = first + second;
			first = second;
			second = result;
			if( result % 2 == 0)
			{
				sum += result;
			}
		}
		System.out.println("Sum: "+sum);
	}
}