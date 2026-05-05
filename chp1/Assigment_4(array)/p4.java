import java.util.Scanner;

class p4
{
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);

		int a[],b[],c[],i;
		
		a = new int[5];
		b = new int[5];
		c = new int[5];

		for(i=0;i<5;i++)
		{
			System.out.print("enetr the value at index "+i+" of array a = ");
			a[i] = s.nextInt();
		}

		for(i=0;i<5;i++)
		{
			b[i] = a[i];
			System.out.print("enter the value at index "+i+" of array b = ");
			b[i] = s.nextInt();
		}	

		for(i=0;i<5;i++)
		{
			c[i] = a[i]+b[i];
			System.out.println("the sum of the index "+i+" in array c = "+c[i]);
		}	
	}
}