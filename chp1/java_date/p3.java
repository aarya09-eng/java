import java.util.Date;

class p3
{
	public static void main()
	{
		Date date = new Date();
	
		String str = String.format("Current date and time = %tc",date);
		System.out.println(str);
	}
}