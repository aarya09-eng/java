import java.util.Scanner;

class p5
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

		int max = a[0];

		for(i=0;i<5;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			else 
			{
				max = max;
			}
		}

		System.out.println("the max value in the array =  "+max);


	}

}