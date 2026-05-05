import java.util.Scanner;

class Stringbufferexample
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		StringBuffer s1 = new StringBuffer("Hello ");
		s1.append("Java");
		System.out.println(s1);
	}
}
