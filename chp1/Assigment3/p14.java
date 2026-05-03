import java.util.Scanner;

class p14
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int i,j;
		char c = 'a';

		for(i=1;i<=4;i++)
		{	
			for(j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}
