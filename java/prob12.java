import java.util.*;

public class prob12
{
	public static void main(String[] args)
	{
		int factorCount = 0;
		int last = 1;
		double num = 1;
		while(factorCount < 500)
		{
			last++;
			num+=last;
			factorCount=getNumberOfFactor(num);
		}
		System.out.println(String.format("%f %d %d", num, factorCount, last));
	}

	public static int getNumberOfFactor(double num)
	{
        int count = 2;
        double sqrt = Math.sqrt(num);
		for(double i=2;i<=sqrt;i++)
		{
			if(num % i == 0)
				count+=2;
		}
		return count;
	}

}