import java.util.Scanner;

class p5
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		char c;

		System.out.println("enetr the character = ");
		 
		c= s.next().charAt(0);
		if(c<='z' && c>='a')
		{
			System.out.println("Lower case");
		}
		else if(c<='Z' && c>='A')
		{
			System.out.println("upper case");
		}
		
	}


}