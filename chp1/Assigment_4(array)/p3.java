import java.util.Scanner;

class p3
{
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);

		int a[],b[],i;
		
		a = new int[5];
		b = new int[5];

		for(i=0;i<5;i++)
		{
			System.out.print("enetr the value at index "+i+" of array a = ");
			a[i] = s.nextInt();
		}

		for(i=0;i<5;i++)
		{
			b[i] = a[i];
			System.out.println("the value at index "+i+" of array b = "+b[i]);
		}		
	}
}