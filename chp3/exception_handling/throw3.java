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