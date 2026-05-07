import java.util.Scanner;

public class p31
{
	public static void main(String args[])
	{

		String s1 = "immutable";
		String s2 = "not immutable";	
		StringBuffer s3 = new StringBuffer("immutable");

		boolean result = s1.contentEquals(s2);
		System.out.println(result);

		result = s1.contentEquals(s3);
		System.out.println(result); 	
	}
}