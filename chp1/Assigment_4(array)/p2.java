import java.util.Scanner;

class p2
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);

		int arr[],i;
		arr = new int[5]; 

				
		for(i=0;i<5;i++)
		{
			System.out.println("enetr the value at index "+i+" = ");
			arr[i] = s.nextInt();
		}

		for(i=0;i<5;i++)
		{
			System.out.println("enetr the value at index "+i+"  = "+arr[i]);
		}

		
	}
}