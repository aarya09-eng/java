import java.util.Scanner;

class p4
{
	public static void main()
	{
		Scanner s = new Scanner(System.in);
		
		int n;

		System.out.println("enetr the number = ");
		n = s.nextInt();

		if(n%2==0)
		{
			System.out.println("even number");
		}
		else if(n%2!=0)
		{
			System.out.println("odd number");
		}
		
	}


}