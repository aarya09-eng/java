import java.util.Scanner;

class p1{
	
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int a,b,c;

		System.out.println("enetr the value of A= ");
		a = s.nextInt();

		System.out.println("enter the value of B = ");
		b = s.nextInt();
 
		c = a + b;
		
		System.out.println("the sum of "+a+" + "+b+" = "+c);
	}

}