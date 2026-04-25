import java.util.Scanner;

class p2
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int age;

		System.out.println("enter the age = ");
		age = s.nextInt();

		if(age>=18)
		{
			System.out.println("eligible for voting");
		}
		else if(age<18)
		{
			System.out.println("Not eligible for voting");
		}

		

	}

}