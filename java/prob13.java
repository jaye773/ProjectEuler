import java.util.Scanner;
import java.math.BigInteger;
import java.io.File;

public class prob13
{	
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(new File("prob13.txt"));
		BigInteger sum = BigInteger.ZERO;
		while(sc.hasNext())
		{
			String num = sc.nextLine();
			sum = sum.add(new BigInteger(num));
		}

		System.out.println("Sum is "+sum);
	}
}