import java.util.Scanner;

class p9
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int n;
		String name;

		System.out.println("enter the number = ");
		n = s.nextInt();

		System.out.println("enter the nmae you wnat to print = ");
		name = s.next();

		for(int i=1;i<=n;i++)
		{
			System.out.println(name);
		}

	}
}