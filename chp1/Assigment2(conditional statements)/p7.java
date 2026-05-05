import java.util.Scanner;

class p7
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		char c;

		System.out.print("enter the character = ");
		c = s.next().charAt(0);

		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||c == 			'E' || c == 'I' || c == 'O' || c == 'U')
		{
			System.out.print(" "+c+" is an vowel");
		}
		else
		{
			System.out.print(" "+c+" is not an vowel");
		} 
	
	}
}