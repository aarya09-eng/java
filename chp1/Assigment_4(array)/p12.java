import java.util.Scanner;

class p12
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int a[],i;
		a = new int[10];
		int p = 0,n = 0,z = 0;

		System.out.print("enter the elements into the array = ");
		for(i=0;i<10;i++)
		{
			a[i] = s.nextInt();
		}

		for(i=0;i<10;i++)
		{
			if(a[i]>0)
			{
				p++;
			}
			else if(a[i]<0)
			{
				n++;
			}
			else if(a[i] == 0)
			{
				z++;
			}
		}

		System.out.println("the count of positive numbers in array = "+p);
		System.out.println("the count of negative numbers in array = "+n);
		System.out.println("the count of  in array = "+z);
		
	}

}