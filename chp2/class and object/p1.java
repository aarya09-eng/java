import java.util.Scanner;

class p1
{
	void fun(int n)
	{
		int i,fact = 1;
		
		for(i=1;i<=n;i++)
		{
			fact = fact * i;
		}

		System.out.println("The factorial= "+fact);
	}

	public static void main(String args[])
	{
		new p1().fun(5);
	}
}