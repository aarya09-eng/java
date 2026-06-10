/**
 * The class "throw3" performs a division operation and prints the result, handling any exceptions that
 * may occur and always printing a final message.
 */
class throw3
{
	public static void main(String args[])
	{
		try
		{
			int data = 50/2;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("the program was sucessfully executed");
		}
	}
}