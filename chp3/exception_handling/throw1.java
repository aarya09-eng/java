public class throw1
{

	public static int divide(int a,int b) throws ArithmeticException
	{
		int div = a/b;
		return div;
	}

	public static void main(String args[])
	{
		throw1 t = new throw1();

		try
		{
			System.out.println(t.divide(3,0));

		}	
		catch(ArithmeticException e)
		{
			System.out.println("number cannot be divide by zero");
		}
	}
}