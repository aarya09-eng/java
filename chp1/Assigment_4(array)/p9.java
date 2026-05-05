import java.util.Scanner;

class p9
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);

		int a[][],b[][],c[][];
		int i,j;

		a = new int[2][3];
		b = new int[2][3];
		c = new int[2][3];

		System.out.println("enter the values in matrix a = ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j] = s.nextInt(); 
			}
		}

		System.out.println("enter the values in matrix b = ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j] = s.nextInt(); 
			}
		}

		System.out.println("the sum of matrix a and b = ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{	
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
		
		
	}
}