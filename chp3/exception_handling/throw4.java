class throw4
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				System.out.println("going to divide by 0");
				int data = 50/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}

			try 
			{
				int a[] = new int[5];
				a[5] = 5;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}		
		}
		catch(Exception e)
		{
			System.out.println("handle the exception outer catch!");
		}

		System.out.println("normal flow");
	}
}