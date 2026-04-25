import java.util.Scanner;

class cube 
{
	public static void main(String args[])
	{	
		Scanner s = new Scanner(System.in);
		int a;

		System.out.print("enter the value = ");
		a = s.nextInt();
		int cube;

		cube = a*a*a;

		System.out.println("the cube of  "+a+" =  "+cube);
	}
}