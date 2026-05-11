public class p7
{
	static int series(int n)
	{
		
		int sum = 0;

		for(int i = 0;i<=n;i++)
		{
			sum = sum + i;
		}

		return sum;
	}

	public static void main(String args[])
	{
		int result = series(5);

		System.out.println("the sum of series =  "+result);
	}
}