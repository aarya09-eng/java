public class NullPointerException1
{
	public static void main(String args[])
	{
		try
		{
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

		System.out.println("code is reset!");
	}
}