import java.util.Scanner;

class p10
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int a[],i,j;
		a = new int[5];

		System.out.print("enter the elements into the array = ");
		for(i=0;i<5;i++)
		{
			a[i] = s.nextInt();
		}
		
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
			if(a[i]>a[j])
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			}
		}
			
		System.out.println("the array in acending order = ");
		for(i=0;i<5;i++)
		{
			System.out.println(" "+a[i]);
		}
		
		
	}

}