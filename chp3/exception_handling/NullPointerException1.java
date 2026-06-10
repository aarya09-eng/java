/**
 * This Java class demonstrates how to catch and handle a NullPointerException when trying to access a
 * method on a null object.
 */
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