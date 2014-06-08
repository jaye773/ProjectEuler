import java.math.BigInteger;

public class prob20 {
	public static void main(String[] args)
	{
		BigInteger sum = BigInteger.ONE;
		for(int i=2;i<=100;i++)
		{
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Integer Sum: "+sumInteger(sum.toString()));
	}

	public static int sumInteger(String val)
	{
		int sum = 0;
		for(int i=0;i<val.length();i++)
		{
			sum += val.charAt(i) - '0';
		}
		return sum;
	}
}
