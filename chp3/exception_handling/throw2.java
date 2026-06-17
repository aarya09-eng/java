public class throw2
{
	public static void validate(int age)
	{
		if(age<18)	
		{
			throw new ArithmeticException("the persons age is not eligible!");
		}
		else 
		{
			System.out.println("the persons age is eligible");
		}
	}

	public static void main(String args[])
	{

		throw2 t = new throw2();
		try
		{
			validate(19s);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error in the try catch code!");	
		}
	}
}