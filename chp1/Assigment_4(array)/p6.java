import java.util.Scanner;

class p6
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

		int min = a[0];
		
		for(i=0;i<5;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
			else
			{
				min = min;
			}
		}
		
		System.out.println("the min value in the array =  "+min);


	}

}