import java.util.Scanner;

class p7
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int n,rev=0,rem;

		System.out.println("enetr the number = ");
		n = s.nextInt();

		while(n!=0)
		{
			rem = n%10;
			rev = rev*10+rem;
			n=n/10; 
		}

		System.out.println("the reverse of the number = "+rev);
	}
}