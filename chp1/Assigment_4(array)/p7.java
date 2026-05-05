import java.util.Scanner;

class p7
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int a[],i;
		a = new int[5];

		System.out.print("enter the elements into the array = ");
		for(i=0;i<5;i++)
		{
			a[i] = s.nextInt();
		}

		int sum = 0;
		
		for(i=0;i<5;i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println("the sum value in the array =  "+sum);


	}

}