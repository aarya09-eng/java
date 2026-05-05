import java.util.Scanner;

class p8
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);

		int arr[][],i,j ;
		arr = new int[2][3]; 

				
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("enetr the value in the array = ");
				arr[i][j] = s.nextInt();
			}
		}

		System.out.print("the 2D matrix = \n");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		
	}
}