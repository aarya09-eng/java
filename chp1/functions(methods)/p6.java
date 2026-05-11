import java.util.Scanner;

class p6
{
	static void array()
	{
		
		static int a[] =  new int[10];

		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the elements in to the array = ");
		for(int i = 0;i<10;i++)
		{
				a[i] = s.nextInt();
		}
	}

	public static void main(String args[])
	{
		array();

		System.out.println("elements in the array are = ");
		for(int i = 0;i<10;i++)
		{
				System.out.println(" "+a[i]);
		}

	}
}
