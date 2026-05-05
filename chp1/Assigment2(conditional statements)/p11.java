import java.util.Scanner;

class p5
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int age;

		System.out.println("enetr the age = ");
		age = s.nextInt();

		if(age<12)
		{
			System.out.println("still a child");
		}
		else if(age<21)
		{
			System.out.println("enjoy life teenagers");
		}
		else if(age<40)
		{
			System.out.println("you are resposible adult");
		}
		else if(age<70)
		{
			System.out.println("respected senior citizen");
		}
		else if(age>70)
		{
			System.out.println("enough on earth better to check out");
		}
		else if(age<0)	
		{
			System.out.println("age can never be negative");
		} 

		
	}
}
