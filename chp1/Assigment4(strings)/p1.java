import java.util.Scanner;

public class p1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		StringBuilder s1 = new StringBuilder("hello ");
		StringBuilder s2 = new StringBuilder("world!");
		StringBuilder result = s1.append(s2);
		System.out.println(result.toString());
	}
}
