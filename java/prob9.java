public class prob9 
{
	public static void main(String[] args)
	{
		for(int i=2;i<=1000;i++)
		{
			for(int j=2;j<=1000;j++)
			{
				int tmp = i*i + j*j;
				double right = Math.sqrt(tmp);
				int left = (int)right;
				if(right==left && (i+j+left) == 1000)
				{
					System.out.println(i+" "+j+" "+left+"="+(i*j*left));
				}
			}
		}
	}	
}