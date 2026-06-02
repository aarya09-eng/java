class p1
{
	public static void main(String args[])
	{
		try
		{
			int data = 50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divisible by zero");
		}
		System.out.println("reset the code");
	}
}