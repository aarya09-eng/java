import java.util.Scanner;

class p3
{
	public static void main()
	{
		Scanner s = new Scanner(System.in);
		
		int n;

		System.out.println("enetr the number = ");
		n = s.nextInt();

		if(n>0)
		{
			System.out.println("positive number");
		}
		else if(n<0)
		{
			System.out.println("negative number");
		}
		
	}


}