import java.util.Scanner;

public class p16
{
	public static void main(String args[])
	{

		String s = new String("Hello");
		String s1 = "Hello";
		String s2 = s.intern();
			
		System.out.println(s == s1);
		System.out.println(s2);
		
	}

}