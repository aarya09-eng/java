import java.util.Scanner;

class p8
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int n,sum=0,digit;

		System.out.println("enetr the number = ");
		n = s.nextInt();

		while(n!=0)
		{
			digit = n%10;
			sum = digit+sum;
			n=n/10; 
		}

		System.out.println("the sum of the number = "+sum);
	}
}