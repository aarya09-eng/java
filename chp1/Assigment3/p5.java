import java.util.Scanner;

class p5
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		int n;
		System.out.println("enetr the multiplicant = ");
		n = s.nextInt();

		for(int i=1;i<=10;i++)
		{
			System.out.println(" "+n+"* "+i+"  =  "+n*i);
		}
	}
}