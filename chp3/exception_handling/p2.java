class p2
{
	public static void main(String args[])
	{
		try
		{
			int data = 50/0;
			System.out.println("rest of code ");
		}		
		catch(Exception e)
		{
			System.out.println("connot divide by 0");
		}
		
	}
}