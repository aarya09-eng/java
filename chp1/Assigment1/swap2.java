import java.util.Scanner;

class swap2
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
	
		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("After swapping:");
		System.out.println("a= "+a+" b= "+b);
	}
}