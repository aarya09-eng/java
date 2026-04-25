import java.util.Scanner;

class swap1
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int a,b;
		int temp;

		System.out.println("enetr the value of A= ");
		a = s.nextInt();

		System.out.println("enter the value of B = ");
		b = s.nextInt();

		System.out.println("Before swapping:");
		System.out.println("a= "+a+" b= "+b);
	
		temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping:");
		System.out.println("a= "+a+" b= "+b);
	}
}