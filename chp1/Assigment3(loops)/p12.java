import java.util.Scanner;

class p12
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int i,j;

		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
